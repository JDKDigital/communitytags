package cy.jdkdigital.communitytags.data;

import cy.jdkdigital.communitytags.CommunityTags;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.FluidTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class CommunityFluidTagsProvider extends FluidTagsProvider
{
    public CommunityFluidTagsProvider(DataGenerator gen, ExistingFileHelper existingFileHelper) {
        super(gen, "forge", existingFileHelper);
    }

    @Override
    public void addTags() {
        this.tag(CommunityTags.Fluids.HONEY);
    }
}
