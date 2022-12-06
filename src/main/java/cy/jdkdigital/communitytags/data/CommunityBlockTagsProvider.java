package cy.jdkdigital.communitytags.data;

import cy.jdkdigital.communitytags.CommunityTags;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.data.ExistingFileHelper;

public class CommunityBlockTagsProvider extends BlockTagsProvider
{
    public CommunityBlockTagsProvider(DataGenerator gen, ExistingFileHelper existingFileHelper) {
        super(gen, "forge", existingFileHelper);
    }

    @Override
    public void addTags() {
        tag(CommunityTags.Blocks.HONEY_BLOCKS).add(Blocks.HONEY_BLOCK);
        tag(CommunityTags.Blocks.MUSHROOMS).addTags(CommunityTags.Blocks.MUSHROOMS_OVERWORLD, CommunityTags.Blocks.MUSHROOMS_NETHER, CommunityTags.Blocks.MUSHROOMS_END);
        tag(CommunityTags.Blocks.MUSHROOMS_OVERWORLD).add(Blocks.RED_MUSHROOM).add(Blocks.BROWN_MUSHROOM);
        tag(CommunityTags.Blocks.MUSHROOMS_NETHER).add(Blocks.CRIMSON_FUNGUS).add(Blocks.WARPED_FUNGUS);
        tag(CommunityTags.Blocks.MUSHROOMS_END);
        tag(CommunityTags.Blocks.POLLEN);
        tag(CommunityTags.Blocks.STORAGE_BLOCKS_HONEYCOMBS).add(Blocks.HONEYCOMB_BLOCK);
        tag(CommunityTags.Blocks.STORAGE_BLOCKS_WAX);
    }
}
