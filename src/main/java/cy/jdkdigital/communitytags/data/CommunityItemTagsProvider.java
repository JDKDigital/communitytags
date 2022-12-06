package cy.jdkdigital.communitytags.data;

import cy.jdkdigital.communitytags.CommunityTags;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.data.ExistingFileHelper;

public class CommunityItemTagsProvider extends ItemTagsProvider
{
    public CommunityItemTagsProvider(DataGenerator gen, BlockTagsProvider blockTagProvider, ExistingFileHelper existingFileHelper) {
        super(gen, blockTagProvider, "forge", existingFileHelper);
    }

    @Override
    public void addTags() {
        tag(CommunityTags.Items.BOOKS).add(Items.BOOK).add(Items.WRITABLE_BOOK).add(Items.WRITTEN_BOOK).add(Items.ENCHANTED_BOOK);
        tag(CommunityTags.Items.BUCKETS).add(Items.BUCKET);
        tag(CommunityTags.Items.BUCKETS_HONEY);
        tag(CommunityTags.Items.COINS).addTags(CommunityTags.Items.COINS_COPPER);
        tag(CommunityTags.Items.COINS_COPPER);
        tag(CommunityTags.Items.HONEYCOMBS).add(Items.HONEYCOMB);
        tag(CommunityTags.Items.HONEY_BOTTLES).add(Items.HONEY_BOTTLE);
        copy(CommunityTags.Blocks.HONEY_BLOCKS, CommunityTags.Items.HONEY_BLOCKS);
        copy(CommunityTags.Blocks.MUSHROOMS, CommunityTags.Items.MUSHROOMS);
        copy(CommunityTags.Blocks.MUSHROOMS_OVERWORLD, CommunityTags.Items.MUSHROOMS_OVERWORLD);
        copy(CommunityTags.Blocks.MUSHROOMS_NETHER, CommunityTags.Items.MUSHROOMS_NETHER);
        copy(CommunityTags.Blocks.MUSHROOMS_END, CommunityTags.Items.MUSHROOMS_END);
        tag(CommunityTags.Items.POLLEN);
        copy(CommunityTags.Blocks.STORAGE_BLOCKS_HONEYCOMBS, CommunityTags.Items.STORAGE_BLOCKS_HONEYCOMBS);
        copy(CommunityTags.Blocks.STORAGE_BLOCKS_WAX, CommunityTags.Items.STORAGE_BLOCKS_WAX);
        tag(CommunityTags.Items.WAX);
    }
}
