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
        tag(CommunityTags.Items.APPLES).add(Items.APPLE);
        tag(CommunityTags.Items.BERRIES).addTags(CommunityTags.Items.BERRIES_GLOWBERRIES, CommunityTags.Items.BERRIES_SWEETBERRIES);
        tag(CommunityTags.Items.BERRIES_GLOWBERRIES).add(Items.GLOW_BERRIES);
        tag(CommunityTags.Items.BERRIES_SWEETBERRIES).add(Items.SWEET_BERRIES);
        tag(CommunityTags.Items.BOOKS).add(Items.BOOK).add(Items.WRITABLE_BOOK).add(Items.WRITTEN_BOOK).add(Items.ENCHANTED_BOOK);
        tag(CommunityTags.Items.BREAD).addTags(CommunityTags.Items.BREAD_WHEAT);
        tag(CommunityTags.Items.BREAD_WHEAT).add(Items.BUCKET);
        tag(CommunityTags.Items.BUCKETS).add(Items.BUCKET);
        tag(CommunityTags.Items.BUCKETS_HONEY);
        tag(CommunityTags.Items.COINS).addTags(CommunityTags.Items.COINS_COPPER);
        tag(CommunityTags.Items.COINS_COPPER);
        tag(CommunityTags.Items.COOKED_BACON);
        tag(CommunityTags.Items.COOKED_BEEF).add(Items.COOKED_BEEF);
        tag(CommunityTags.Items.COOKED_CHICKEN).add(Items.COOKED_CHICKEN);
        tag(CommunityTags.Items.COOKED_FISHES).addTags(CommunityTags.Items.COOKED_FISHES_COD, CommunityTags.Items.COOKED_FISHES_SALMON);
        tag(CommunityTags.Items.COOKED_FISHES_COD).add(Items.COOKED_COD);
        tag(CommunityTags.Items.COOKED_FISHES_SALMON).add(Items.COOKED_SALMON);
        tag(CommunityTags.Items.COOKED_MEATS).addTags(CommunityTags.Items.COOKED_BACON, CommunityTags.Items.COOKED_BEEF, CommunityTags.Items.COOKED_FISHES, CommunityTags.Items.COOKED_MUTTON, CommunityTags.Items.COOKED_PORK, CommunityTags.Items.COOKED_POULTRY, CommunityTags.Items.COOKED_RABBIT, CommunityTags.Items.COOKED_VENISON);
        tag(CommunityTags.Items.COOKED_MUTTON);
        tag(CommunityTags.Items.COOKED_PORK).add(Items.COOKED_PORKCHOP);
        tag(CommunityTags.Items.COOKED_POULTRY).addTags(CommunityTags.Items.COOKED_CHICKEN);
        tag(CommunityTags.Items.COOKED_RABBIT).add(Items.COOKED_RABBIT);
        tag(CommunityTags.Items.COOKED_VENISON);
        tag(CommunityTags.Items.DOUGH).addTags(CommunityTags.Items.DOUGH_WHEAT);
        tag(CommunityTags.Items.DOUGH_WHEAT);
        tag(CommunityTags.Items.FRUITS).addTags(CommunityTags.Items.FRUITS_APPLE, CommunityTags.Items.FRUITS_CHORUSFRUIT, CommunityTags.Items.FRUITS_MELON, CommunityTags.Items.FRUITS_SWEETBERRIES);
        tag(CommunityTags.Items.FRUITS_APPLE).add(Items.APPLE);
        tag(CommunityTags.Items.FRUITS_CHORUSFRUIT).add(Items.CHORUS_FRUIT);
        tag(CommunityTags.Items.FRUITS_MELON).add(Items.MELON);
        tag(CommunityTags.Items.FRUITS_SWEETBERRIES).add(Items.SWEET_BERRIES);
        tag(CommunityTags.Items.GRAIN).addTags(CommunityTags.Items.GRAIN_BARLEY, CommunityTags.Items.GRAIN_CORN, CommunityTags.Items.GRAIN_OAT, CommunityTags.Items.GRAIN_RICE,CommunityTags.Items.GRAIN_WHEAT);
        tag(CommunityTags.Items.GRAIN_BARLEY);
        tag(CommunityTags.Items.GRAIN_CORN);
        tag(CommunityTags.Items.GRAIN_OAT);
        tag(CommunityTags.Items.GRAIN_RICE);
        tag(CommunityTags.Items.GRAIN_WHEAT).add(Items.WHEAT);
        tag(CommunityTags.Items.HONEYCOMBS).add(Items.HONEYCOMB);
        tag(CommunityTags.Items.HONEY_BOTTLES).add(Items.HONEY_BOTTLE);
        copy(CommunityTags.Blocks.HONEY_BLOCKS, CommunityTags.Items.HONEY_BLOCKS);
        tag(CommunityTags.Items.MILK).addTags(CommunityTags.Items.MILK_MILK, CommunityTags.Items.MILK_FRESHMLIK, CommunityTags.Items.MILK_MILK_BOTTLE);
        tag(CommunityTags.Items.MILK_MILK).add(Items.MILK_BUCKET);
        tag(CommunityTags.Items.MILK_FRESHMLIK);
        tag(CommunityTags.Items.MILK_MILK_BOTTLE);
        copy(CommunityTags.Blocks.MUSHROOMS, CommunityTags.Items.MUSHROOMS);
        copy(CommunityTags.Blocks.MUSHROOMS_OVERWORLD, CommunityTags.Items.MUSHROOMS_OVERWORLD);
        copy(CommunityTags.Blocks.MUSHROOMS_NETHER, CommunityTags.Items.MUSHROOMS_NETHER);
        copy(CommunityTags.Blocks.MUSHROOMS_END, CommunityTags.Items.MUSHROOMS_END);
        tag(CommunityTags.Items.POLLEN);
        tag(CommunityTags.Items.RAW_BACON);
        tag(CommunityTags.Items.RAW_BEEF).add(Items.BEEF);
        tag(CommunityTags.Items.RAW_CHICKEN).add(Items.CHICKEN);
        tag(CommunityTags.Items.RAW_FISHES).addTags(CommunityTags.Items.RAW_FISHES_COD, CommunityTags.Items.RAW_FISHES_SALMON, CommunityTags.Items.RAW_FISHES_TROPICAL_FISH);
        tag(CommunityTags.Items.RAW_FISHES_COD).add(Items.COD);
        tag(CommunityTags.Items.RAW_FISHES_SALMON).add(Items.SALMON);
        tag(CommunityTags.Items.RAW_FISHES_TROPICAL_FISH).add(Items.TROPICAL_FISH);
        tag(CommunityTags.Items.RAW_MEATS).addTags(CommunityTags.Items.RAW_BACON, CommunityTags.Items.RAW_BEEF, CommunityTags.Items.RAW_FISHES, CommunityTags.Items.RAW_MUTTON, CommunityTags.Items.RAW_PORK, CommunityTags.Items.RAW_POULTRY, CommunityTags.Items.RAW_RABBIT, CommunityTags.Items.RAW_VENISON);
        tag(CommunityTags.Items.RAW_MUTTON);
        tag(CommunityTags.Items.RAW_PORK).add(Items.PORKCHOP);
        tag(CommunityTags.Items.RAW_POULTRY).addTags(CommunityTags.Items.RAW_CHICKEN);
        tag(CommunityTags.Items.RAW_RABBIT).add(Items.RABBIT);
        tag(CommunityTags.Items.RAW_VENISON);
        tag(CommunityTags.Items.SALT);
        copy(CommunityTags.Blocks.STORAGE_BLOCKS_HONEYCOMBS, CommunityTags.Items.STORAGE_BLOCKS_HONEYCOMBS);
        copy(CommunityTags.Blocks.STORAGE_BLOCKS_WAX, CommunityTags.Items.STORAGE_BLOCKS_WAX);
        tag(CommunityTags.Items.VEGETABLES).addTags(CommunityTags.Items.VEGETABLES_BEETROOT, CommunityTags.Items.VEGETABLES_CARROT, CommunityTags.Items.VEGETABLES_CUCUMBER, CommunityTags.Items.VEGETABLES_ONION, CommunityTags.Items.VEGETABLES_POTATO, CommunityTags.Items.VEGETABLES_TOMATO);
        tag(CommunityTags.Items.VEGETABLES_BEETROOT).add(Items.BEETROOT);
        tag(CommunityTags.Items.VEGETABLES_CARROT).add(Items.CARROT);
        tag(CommunityTags.Items.VEGETABLES_CUCUMBER);
        tag(CommunityTags.Items.VEGETABLES_ONION);
        tag(CommunityTags.Items.VEGETABLES_POTATO).add(Items.POTATO);
        tag(CommunityTags.Items.VEGETABLES_TOMATO);
        tag(CommunityTags.Items.VINEGAR).addTags(CommunityTags.Items.VINEGAR_GRAPE);
        tag(CommunityTags.Items.VINEGAR_GRAPE);
        tag(CommunityTags.Items.WAX);
    }
}
