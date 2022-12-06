package cy.jdkdigital.communitytags;

import com.mojang.logging.LogUtils;
import cy.jdkdigital.communitytags.data.CommunityBlockTagsProvider;
import cy.jdkdigital.communitytags.data.CommunityFluidTagsProvider;
import cy.jdkdigital.communitytags.data.CommunityItemTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(CTMod.MODID)
public class CTMod
{
    // Define mod id in a common place for everything to reference
    public static final String MODID = "communitytags";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public CTMod()
    {
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::gatherData);
    }

    public void gatherData(GatherDataEvent event) {
        DataGenerator gen = event.getGenerator();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CommunityBlockTagsProvider blockTags = new CommunityBlockTagsProvider(gen, existingFileHelper);

        event.getGenerator().addProvider(event.includeServer(), blockTags);
        event.getGenerator().addProvider(event.includeServer(), new CommunityItemTagsProvider(gen, blockTags, existingFileHelper));
        event.getGenerator().addProvider(event.includeServer(), new CommunityFluidTagsProvider(gen, existingFileHelper));
    }
}
