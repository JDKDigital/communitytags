package cy.jdkdigital.communitytags;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Fluid;

public class CommunityTags
{
    public CommunityTags() {
    }

    public static void init() {
        CommunityTags.Blocks.init();
        CommunityTags.EntityTypes.init();
        CommunityTags.Items.init();
        CommunityTags.Fluids.init();
        CommunityTags.Biomes.init();
    }
    static public class Items {
        private static void init(){}

        public static final TagKey<Item> APPLES = tag("apples");
        public static final TagKey<Item> BERRIES = tag("berries");
        public static final TagKey<Item> BERRIES_SWEETBERRIES = tag("berries/sweetberries");
        public static final TagKey<Item> BERRIES_GLOWBERRIES = tag("berries/glowberries");
        public static final TagKey<Item> BOOKS = tag("books");
        public static final TagKey<Item> BREAD = tag("bread");
        public static final TagKey<Item> BREAD_WHEAT = tag("bread/wheat");
        public static final TagKey<Item> BUCKETS = tag("buckets");
        public static final TagKey<Item> BUCKETS_HONEY = tag("buckets/honey");
        public static final TagKey<Item> COINS = tag("coins");
        public static final TagKey<Item> COINS_COPPER = tag("coins/copper");
        public static final TagKey<Item> DOUGH = tag("dough");
        public static final TagKey<Item> DOUGH_WHEAT = tag("dough/wheat");
        public static final TagKey<Item> FRUITS = tag("fruits");
        public static final TagKey<Item> FRUITS_APPLE = tag("fruits/apple");
        public static final TagKey<Item> FRUITS_CHORUSFRUIT = tag("fruits/chorusfruit");
        public static final TagKey<Item> FRUITS_MELON = tag("fruits/melon");
        public static final TagKey<Item> FRUITS_SWEETBERRIES = tag("fruits/sweetberries");
        public static final TagKey<Item> GRAIN = tag("grain");
        public static final TagKey<Item> GRAIN_BARLEY = tag("grain/barley");
        public static final TagKey<Item> GRAIN_CORN = tag("grain/corn");
        public static final TagKey<Item> GRAIN_OAT = tag("grain/oat");
        public static final TagKey<Item> GRAIN_RICE = tag("grain/rice");
        public static final TagKey<Item> GRAIN_WHEAT = tag("grain/wheat");
        public static final TagKey<Item> HONEYCOMBS = tag("honeycombs");
        public static final TagKey<Item> HONEY_BOTTLES = tag("honey_bottles");
        public static final TagKey<Item> HONEY_BLOCKS = tag("honey_blocks");
        public static final TagKey<Item> MILK = tag("milk");
        public static final TagKey<Item> MILK_MILK = tag("milk/milk");
        public static final TagKey<Item> MILK_FRESHMLIK = tag("milk/freshmilk");
        public static final TagKey<Item> MILK_MILK_BOTTLE = tag("milk/milk_bottle");
        public static final TagKey<Item> MUSHROOMS = tag("mushrooms");
        public static final TagKey<Item> MUSHROOMS_OVERWORLD = tag("mushrooms/overworld");
        public static final TagKey<Item> MUSHROOMS_NETHER = tag("mushrooms/nether");
        public static final TagKey<Item> MUSHROOMS_END = tag("mushrooms/end");
        public static final TagKey<Item> POLLEN = tag("pollen");
        public static final TagKey<Item> SALT = tag("salt");
        public static final TagKey<Item> STORAGE_BLOCKS_HONEYCOMBS = tag("storage_blocks/honeycombs");
        public static final TagKey<Item> STORAGE_BLOCKS_WAX = tag("storage_blocks/wax");
        public static final TagKey<Item> VEGETABLES = tag("vegetables");
        public static final TagKey<Item> VEGETABLES_BEETROOT = tag("vegetables/beetroot");
        public static final TagKey<Item> VEGETABLES_CARROT = tag("vegetables/carrot");
        public static final TagKey<Item> VEGETABLES_CUCUMBER = tag("vegetables/cucumber");
        public static final TagKey<Item> VEGETABLES_ONION = tag("vegetables/onion");
        public static final TagKey<Item> VEGETABLES_POTATO = tag("vegetables/potato");
        public static final TagKey<Item> VEGETABLES_TOMATO = tag("vegetables/tomato");
        public static final TagKey<Item> WAX = tag("wax");

        private static TagKey<Item> tag(String name) {
            return TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation("forge", name));
        }
    }
    static public class Blocks {
        private static void init(){}
        public static final TagKey<Block> HONEY_BLOCKS = tag("honey_blocks");
        public static final TagKey<Block> MUSHROOMS = tag("mushrooms");
        public static final TagKey<Block> MUSHROOMS_OVERWORLD = tag("mushrooms/overworld");
        public static final TagKey<Block> MUSHROOMS_NETHER = tag("mushrooms/nether");
        public static final TagKey<Block> MUSHROOMS_END = tag("mushrooms/end");
        public static final TagKey<Block> POLLEN = tag("pollen");
        public static final TagKey<Block> STORAGE_BLOCKS_HONEYCOMBS = tag("storage_blocks/honeycombs");
        public static final TagKey<Block> STORAGE_BLOCKS_WAX = tag("storage_blocks/wax");

        private static TagKey<Block> tag(String name) {
            return TagKey.create(Registry.BLOCK_REGISTRY, new ResourceLocation("forge", name));
        }
    }
    static public class Fluids {
        private static void init(){}

        public static final TagKey<Fluid> HONEY = tag("honey");

        private static TagKey<Fluid> tag(String name) {
            return TagKey.create(Registry.FLUID_REGISTRY, new ResourceLocation("forge", name));
        }
    }
    static public class EntityTypes {
        private static void init(){}

        private static TagKey<EntityType<?>> tag(String name) {
            return TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("forge", name));
        }
    }
    static public class Biomes {
        private static void init(){}

        private static TagKey<Biome> tag(String name) {
            return TagKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("forge", name));
        }
    }
}
