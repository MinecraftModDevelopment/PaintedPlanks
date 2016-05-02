package paintedplanks.init;

import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class Recipes {

	private static boolean initDone = false;

	public static void init(){
		if(initDone)return;

		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.oak_planks_white), "xxx","xyx","xxx",'x',new ItemStack(net.minecraft.init.Blocks.PLANKS, 1, 0),      'y', new ItemStack(net.minecraft.init.Items.DYE, 1, 15)));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.oak_planks_orange), "xxx","xyx","xxx",'x',new ItemStack(net.minecraft.init.Blocks.PLANKS, 1, 0),     'y', new ItemStack(net.minecraft.init.Items.DYE, 1, 14)));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.oak_planks_magenta), "xxx","xyx","xxx",'x',new ItemStack(net.minecraft.init.Blocks.PLANKS, 1, 0),    'y', new ItemStack(net.minecraft.init.Items.DYE, 1, 13)));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.oak_planks_light_blue), "xxx","xyx","xxx",'x',new ItemStack(net.minecraft.init.Blocks.PLANKS, 1, 0), 'y', new ItemStack(net.minecraft.init.Items.DYE, 1, 12)));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.oak_planks_yellow), "xxx","xyx","xxx",'x',new ItemStack(net.minecraft.init.Blocks.PLANKS, 1, 0),     'y', new ItemStack(net.minecraft.init.Items.DYE, 1, 11)));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.oak_planks_lime), "xxx","xyx","xxx",'x',new ItemStack(net.minecraft.init.Blocks.PLANKS, 1, 0),       'y', new ItemStack(net.minecraft.init.Items.DYE, 1, 10)));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.oak_planks_pink), "xxx","xyx","xxx",'x',new ItemStack(net.minecraft.init.Blocks.PLANKS, 1, 0),       'y', new ItemStack(net.minecraft.init.Items.DYE, 1, 9)));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.oak_planks_gray), "xxx","xyx","xxx",'x',new ItemStack(net.minecraft.init.Blocks.PLANKS, 1, 0),       'y', new ItemStack(net.minecraft.init.Items.DYE, 1, 8)));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.oak_planks_silver), "xxx","xyx","xxx",'x',new ItemStack(net.minecraft.init.Blocks.PLANKS, 1, 0),     'y', new ItemStack(net.minecraft.init.Items.DYE, 1, 7)));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.oak_planks_cyan), "xxx","xyx","xxx",'x',new ItemStack(net.minecraft.init.Blocks.PLANKS, 1, 0),       'y', new ItemStack(net.minecraft.init.Items.DYE, 1, 6)));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.oak_planks_purple), "xxx","xyx","xxx",'x',new ItemStack(net.minecraft.init.Blocks.PLANKS, 1, 0),     'y', new ItemStack(net.minecraft.init.Items.DYE, 1, 5)));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.oak_planks_blue), "xxx","xyx","xxx",'x',new ItemStack(net.minecraft.init.Blocks.PLANKS, 1, 0),       'y', new ItemStack(net.minecraft.init.Items.DYE, 1, 4)));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.oak_planks_brown), "xxx","xyx","xxx",'x',new ItemStack(net.minecraft.init.Blocks.PLANKS, 1, 0),      'y', new ItemStack(net.minecraft.init.Items.DYE, 1, 3)));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.oak_planks_green), "xxx","xyx","xxx",'x',new ItemStack(net.minecraft.init.Blocks.PLANKS, 1, 0),      'y', new ItemStack(net.minecraft.init.Items.DYE, 1, 2)));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.oak_planks_red), "xxx","xyx","xxx",'x',new ItemStack(net.minecraft.init.Blocks.PLANKS, 1, 0),        'y', new ItemStack(net.minecraft.init.Items.DYE, 1, 1)));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.oak_planks_black), "xxx","xyx","xxx",'x',new ItemStack(net.minecraft.init.Blocks.PLANKS, 1, 0),      'y', new ItemStack(net.minecraft.init.Items.DYE, 1, 0)));

		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(net.minecraft.init.Blocks.PLANKS, 1, 0), "xxx","xyx","xxx",'x',new ItemStack(Blocks.oak_planks_white),      'y', new ItemStack(net.minecraft.init.Items.WATER_BUCKET, 1, 0)));

		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.spruce_planks_white), "xxx","xyx","xxx",'x',new ItemStack(net.minecraft.init.Blocks.PLANKS, 1, 1),      'y', new ItemStack(net.minecraft.init.Items.DYE, 1, 15)));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.spruce_planks_orange), "xxx","xyx","xxx",'x',new ItemStack(net.minecraft.init.Blocks.PLANKS, 1, 1),     'y', new ItemStack(net.minecraft.init.Items.DYE, 1, 14)));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.spruce_planks_magenta), "xxx","xyx","xxx",'x',new ItemStack(net.minecraft.init.Blocks.PLANKS, 1, 1),    'y', new ItemStack(net.minecraft.init.Items.DYE, 1, 13)));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.spruce_planks_light_blue), "xxx","xyx","xxx",'x',new ItemStack(net.minecraft.init.Blocks.PLANKS, 1, 1), 'y', new ItemStack(net.minecraft.init.Items.DYE, 1, 12)));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.spruce_planks_yellow), "xxx","xyx","xxx",'x',new ItemStack(net.minecraft.init.Blocks.PLANKS, 1, 1),     'y', new ItemStack(net.minecraft.init.Items.DYE, 1, 11)));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.spruce_planks_lime), "xxx","xyx","xxx",'x',new ItemStack(net.minecraft.init.Blocks.PLANKS, 1, 1),       'y', new ItemStack(net.minecraft.init.Items.DYE, 1, 10)));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.spruce_planks_pink), "xxx","xyx","xxx",'x',new ItemStack(net.minecraft.init.Blocks.PLANKS, 1, 1),       'y', new ItemStack(net.minecraft.init.Items.DYE, 1, 9)));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.spruce_planks_gray), "xxx","xyx","xxx",'x',new ItemStack(net.minecraft.init.Blocks.PLANKS, 1, 1),       'y', new ItemStack(net.minecraft.init.Items.DYE, 1, 8)));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.spruce_planks_silver), "xxx","xyx","xxx",'x',new ItemStack(net.minecraft.init.Blocks.PLANKS, 1, 1),     'y', new ItemStack(net.minecraft.init.Items.DYE, 1, 7)));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.spruce_planks_cyan), "xxx","xyx","xxx",'x',new ItemStack(net.minecraft.init.Blocks.PLANKS, 1, 1),       'y', new ItemStack(net.minecraft.init.Items.DYE, 1, 6)));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.spruce_planks_purple), "xxx","xyx","xxx",'x',new ItemStack(net.minecraft.init.Blocks.PLANKS, 1, 1),     'y', new ItemStack(net.minecraft.init.Items.DYE, 1, 5)));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.spruce_planks_blue), "xxx","xyx","xxx",'x',new ItemStack(net.minecraft.init.Blocks.PLANKS, 1, 1),       'y', new ItemStack(net.minecraft.init.Items.DYE, 1, 4)));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.spruce_planks_brown), "xxx","xyx","xxx",'x',new ItemStack(net.minecraft.init.Blocks.PLANKS, 1, 1),      'y', new ItemStack(net.minecraft.init.Items.DYE, 1, 3)));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.spruce_planks_green), "xxx","xyx","xxx",'x',new ItemStack(net.minecraft.init.Blocks.PLANKS, 1, 1),      'y', new ItemStack(net.minecraft.init.Items.DYE, 1, 2)));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.spruce_planks_red), "xxx","xyx","xxx",'x',new ItemStack(net.minecraft.init.Blocks.PLANKS, 1, 1),        'y', new ItemStack(net.minecraft.init.Items.DYE, 1, 1)));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.spruce_planks_black), "xxx","xyx","xxx",'x',new ItemStack(net.minecraft.init.Blocks.PLANKS, 1, 1),      'y', new ItemStack(net.minecraft.init.Items.DYE, 1, 0)));

		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(net.minecraft.init.Blocks.PLANKS, 1, 1), "xxx","xyx","xxx",'x',new ItemStack(Blocks.spruce_planks_white),      'y', new ItemStack(net.minecraft.init.Items.WATER_BUCKET, 1, 0)));

		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.birch_planks_white), "xxx","xyx","xxx",'x',new ItemStack(net.minecraft.init.Blocks.PLANKS, 1, 2),      'y', new ItemStack(net.minecraft.init.Items.DYE, 1, 15)));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.birch_planks_orange), "xxx","xyx","xxx",'x',new ItemStack(net.minecraft.init.Blocks.PLANKS, 1, 2),     'y', new ItemStack(net.minecraft.init.Items.DYE, 1, 14)));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.birch_planks_magenta), "xxx","xyx","xxx",'x',new ItemStack(net.minecraft.init.Blocks.PLANKS, 1, 2),    'y', new ItemStack(net.minecraft.init.Items.DYE, 1, 13)));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.birch_planks_light_blue), "xxx","xyx","xxx",'x',new ItemStack(net.minecraft.init.Blocks.PLANKS, 1, 2), 'y', new ItemStack(net.minecraft.init.Items.DYE, 1, 12)));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.birch_planks_yellow), "xxx","xyx","xxx",'x',new ItemStack(net.minecraft.init.Blocks.PLANKS, 1, 2),     'y', new ItemStack(net.minecraft.init.Items.DYE, 1, 11)));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.birch_planks_lime), "xxx","xyx","xxx",'x',new ItemStack(net.minecraft.init.Blocks.PLANKS, 1, 2),       'y', new ItemStack(net.minecraft.init.Items.DYE, 1, 10)));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.birch_planks_pink), "xxx","xyx","xxx",'x',new ItemStack(net.minecraft.init.Blocks.PLANKS, 1, 2),       'y', new ItemStack(net.minecraft.init.Items.DYE, 1, 9)));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.birch_planks_gray), "xxx","xyx","xxx",'x',new ItemStack(net.minecraft.init.Blocks.PLANKS, 1, 2),       'y', new ItemStack(net.minecraft.init.Items.DYE, 1, 8)));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.birch_planks_silver), "xxx","xyx","xxx",'x',new ItemStack(net.minecraft.init.Blocks.PLANKS, 1, 2),     'y', new ItemStack(net.minecraft.init.Items.DYE, 1, 7)));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.birch_planks_cyan), "xxx","xyx","xxx",'x',new ItemStack(net.minecraft.init.Blocks.PLANKS, 1, 2),       'y', new ItemStack(net.minecraft.init.Items.DYE, 1, 6)));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.birch_planks_purple), "xxx","xyx","xxx",'x',new ItemStack(net.minecraft.init.Blocks.PLANKS, 1, 2),     'y', new ItemStack(net.minecraft.init.Items.DYE, 1, 5)));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.birch_planks_blue), "xxx","xyx","xxx",'x',new ItemStack(net.minecraft.init.Blocks.PLANKS, 1, 2),       'y', new ItemStack(net.minecraft.init.Items.DYE, 1, 4)));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.birch_planks_brown), "xxx","xyx","xxx",'x',new ItemStack(net.minecraft.init.Blocks.PLANKS, 1, 2),      'y', new ItemStack(net.minecraft.init.Items.DYE, 1, 3)));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.birch_planks_green), "xxx","xyx","xxx",'x',new ItemStack(net.minecraft.init.Blocks.PLANKS, 1, 2),      'y', new ItemStack(net.minecraft.init.Items.DYE, 1, 2)));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.birch_planks_red), "xxx","xyx","xxx",'x',new ItemStack(net.minecraft.init.Blocks.PLANKS, 1, 2),        'y', new ItemStack(net.minecraft.init.Items.DYE, 1, 1)));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.birch_planks_black), "xxx","xyx","xxx",'x',new ItemStack(net.minecraft.init.Blocks.PLANKS, 1, 2),      'y', new ItemStack(net.minecraft.init.Items.DYE, 1, 0)));

		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(net.minecraft.init.Blocks.PLANKS, 1, 2), "xxx","xyx","xxx",'x',new ItemStack(Blocks.birch_planks_white),      'y', new ItemStack(net.minecraft.init.Items.WATER_BUCKET, 1, 0)));

		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.jungle_planks_white), "xxx","xyx","xxx",'x',new ItemStack(net.minecraft.init.Blocks.PLANKS, 1, 3),      'y', new ItemStack(net.minecraft.init.Items.DYE, 1, 15)));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.jungle_planks_orange), "xxx","xyx","xxx",'x',new ItemStack(net.minecraft.init.Blocks.PLANKS, 1, 3),     'y', new ItemStack(net.minecraft.init.Items.DYE, 1, 14)));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.jungle_planks_magenta), "xxx","xyx","xxx",'x',new ItemStack(net.minecraft.init.Blocks.PLANKS, 1, 3),    'y', new ItemStack(net.minecraft.init.Items.DYE, 1, 13)));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.jungle_planks_light_blue), "xxx","xyx","xxx",'x',new ItemStack(net.minecraft.init.Blocks.PLANKS, 1, 3), 'y', new ItemStack(net.minecraft.init.Items.DYE, 1, 12)));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.jungle_planks_yellow), "xxx","xyx","xxx",'x',new ItemStack(net.minecraft.init.Blocks.PLANKS, 1, 3),     'y', new ItemStack(net.minecraft.init.Items.DYE, 1, 11)));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.jungle_planks_lime), "xxx","xyx","xxx",'x',new ItemStack(net.minecraft.init.Blocks.PLANKS, 1, 3),       'y', new ItemStack(net.minecraft.init.Items.DYE, 1, 10)));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.jungle_planks_pink), "xxx","xyx","xxx",'x',new ItemStack(net.minecraft.init.Blocks.PLANKS, 1, 3),       'y', new ItemStack(net.minecraft.init.Items.DYE, 1, 9)));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.jungle_planks_gray), "xxx","xyx","xxx",'x',new ItemStack(net.minecraft.init.Blocks.PLANKS, 1, 3),       'y', new ItemStack(net.minecraft.init.Items.DYE, 1, 8)));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.jungle_planks_silver), "xxx","xyx","xxx",'x',new ItemStack(net.minecraft.init.Blocks.PLANKS, 1, 3),     'y', new ItemStack(net.minecraft.init.Items.DYE, 1, 7)));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.jungle_planks_cyan), "xxx","xyx","xxx",'x',new ItemStack(net.minecraft.init.Blocks.PLANKS, 1, 3),       'y', new ItemStack(net.minecraft.init.Items.DYE, 1, 6)));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.jungle_planks_purple), "xxx","xyx","xxx",'x',new ItemStack(net.minecraft.init.Blocks.PLANKS, 1, 3),     'y', new ItemStack(net.minecraft.init.Items.DYE, 1, 5)));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.jungle_planks_blue), "xxx","xyx","xxx",'x',new ItemStack(net.minecraft.init.Blocks.PLANKS, 1, 3),       'y', new ItemStack(net.minecraft.init.Items.DYE, 1, 4)));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.jungle_planks_brown), "xxx","xyx","xxx",'x',new ItemStack(net.minecraft.init.Blocks.PLANKS, 1, 3),      'y', new ItemStack(net.minecraft.init.Items.DYE, 1, 3)));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.jungle_planks_green), "xxx","xyx","xxx",'x',new ItemStack(net.minecraft.init.Blocks.PLANKS, 1, 3),      'y', new ItemStack(net.minecraft.init.Items.DYE, 1, 2)));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.jungle_planks_red), "xxx","xyx","xxx",'x',new ItemStack(net.minecraft.init.Blocks.PLANKS, 1, 3),        'y', new ItemStack(net.minecraft.init.Items.DYE, 1, 1)));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.jungle_planks_black), "xxx","xyx","xxx",'x',new ItemStack(net.minecraft.init.Blocks.PLANKS, 1, 3),      'y', new ItemStack(net.minecraft.init.Items.DYE, 1, 0)));

		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(net.minecraft.init.Blocks.PLANKS, 1, 3), "xxx","xyx","xxx",'x',new ItemStack(Blocks.jungle_planks_white),      'y', new ItemStack(net.minecraft.init.Items.WATER_BUCKET, 1, 0)));

		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.acacia_planks_white), "xxx","xyx","xxx",'x',new ItemStack(net.minecraft.init.Blocks.PLANKS, 1, 4),      'y', new ItemStack(net.minecraft.init.Items.DYE, 1, 15)));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.acacia_planks_orange), "xxx","xyx","xxx",'x',new ItemStack(net.minecraft.init.Blocks.PLANKS, 1, 4),     'y', new ItemStack(net.minecraft.init.Items.DYE, 1, 14)));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.acacia_planks_magenta), "xxx","xyx","xxx",'x',new ItemStack(net.minecraft.init.Blocks.PLANKS, 1, 4),    'y', new ItemStack(net.minecraft.init.Items.DYE, 1, 13)));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.acacia_planks_light_blue), "xxx","xyx","xxx",'x',new ItemStack(net.minecraft.init.Blocks.PLANKS, 1, 4), 'y', new ItemStack(net.minecraft.init.Items.DYE, 1, 12)));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.acacia_planks_yellow), "xxx","xyx","xxx",'x',new ItemStack(net.minecraft.init.Blocks.PLANKS, 1, 4),     'y', new ItemStack(net.minecraft.init.Items.DYE, 1, 11)));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.acacia_planks_lime), "xxx","xyx","xxx",'x',new ItemStack(net.minecraft.init.Blocks.PLANKS, 1, 4),       'y', new ItemStack(net.minecraft.init.Items.DYE, 1, 10)));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.acacia_planks_pink), "xxx","xyx","xxx",'x',new ItemStack(net.minecraft.init.Blocks.PLANKS, 1, 4),       'y', new ItemStack(net.minecraft.init.Items.DYE, 1, 9)));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.acacia_planks_gray), "xxx","xyx","xxx",'x',new ItemStack(net.minecraft.init.Blocks.PLANKS, 1, 4),       'y', new ItemStack(net.minecraft.init.Items.DYE, 1, 8)));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.acacia_planks_silver), "xxx","xyx","xxx",'x',new ItemStack(net.minecraft.init.Blocks.PLANKS, 1, 4),     'y', new ItemStack(net.minecraft.init.Items.DYE, 1, 7)));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.acacia_planks_cyan), "xxx","xyx","xxx",'x',new ItemStack(net.minecraft.init.Blocks.PLANKS, 1, 4),       'y', new ItemStack(net.minecraft.init.Items.DYE, 1, 6)));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.acacia_planks_purple), "xxx","xyx","xxx",'x',new ItemStack(net.minecraft.init.Blocks.PLANKS, 1, 4),     'y', new ItemStack(net.minecraft.init.Items.DYE, 1, 5)));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.acacia_planks_blue), "xxx","xyx","xxx",'x',new ItemStack(net.minecraft.init.Blocks.PLANKS, 1, 4),       'y', new ItemStack(net.minecraft.init.Items.DYE, 1, 4)));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.acacia_planks_brown), "xxx","xyx","xxx",'x',new ItemStack(net.minecraft.init.Blocks.PLANKS, 1, 4),      'y', new ItemStack(net.minecraft.init.Items.DYE, 1, 3)));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.acacia_planks_green), "xxx","xyx","xxx",'x',new ItemStack(net.minecraft.init.Blocks.PLANKS, 1, 4),      'y', new ItemStack(net.minecraft.init.Items.DYE, 1, 2)));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.acacia_planks_red), "xxx","xyx","xxx",'x',new ItemStack(net.minecraft.init.Blocks.PLANKS, 1, 4),        'y', new ItemStack(net.minecraft.init.Items.DYE, 1, 1)));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.acacia_planks_black), "xxx","xyx","xxx",'x',new ItemStack(net.minecraft.init.Blocks.PLANKS, 1, 4),      'y', new ItemStack(net.minecraft.init.Items.DYE, 1, 0)));

		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(net.minecraft.init.Blocks.PLANKS, 1, 4), "xxx","xyx","xxx",'x',new ItemStack(Blocks.acacia_planks_white),      'y', new ItemStack(net.minecraft.init.Items.WATER_BUCKET, 1, 0)));

		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.big_oak_planks_white), "xxx","xyx","xxx",'x',new ItemStack(net.minecraft.init.Blocks.PLANKS, 1, 5),      'y', new ItemStack(net.minecraft.init.Items.DYE, 1, 15)));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.big_oak_planks_orange), "xxx","xyx","xxx",'x',new ItemStack(net.minecraft.init.Blocks.PLANKS, 1, 5),     'y', new ItemStack(net.minecraft.init.Items.DYE, 1, 14)));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.big_oak_planks_magenta), "xxx","xyx","xxx",'x',new ItemStack(net.minecraft.init.Blocks.PLANKS, 1, 5),    'y', new ItemStack(net.minecraft.init.Items.DYE, 1, 13)));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.big_oak_planks_light_blue), "xxx","xyx","xxx",'x',new ItemStack(net.minecraft.init.Blocks.PLANKS, 1, 5), 'y', new ItemStack(net.minecraft.init.Items.DYE, 1, 12)));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.big_oak_planks_yellow), "xxx","xyx","xxx",'x',new ItemStack(net.minecraft.init.Blocks.PLANKS, 1, 5),     'y', new ItemStack(net.minecraft.init.Items.DYE, 1, 11)));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.big_oak_planks_lime), "xxx","xyx","xxx",'x',new ItemStack(net.minecraft.init.Blocks.PLANKS, 1, 5),       'y', new ItemStack(net.minecraft.init.Items.DYE, 1, 10)));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.big_oak_planks_pink), "xxx","xyx","xxx",'x',new ItemStack(net.minecraft.init.Blocks.PLANKS, 1, 5),       'y', new ItemStack(net.minecraft.init.Items.DYE, 1, 9)));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.big_oak_planks_gray), "xxx","xyx","xxx",'x',new ItemStack(net.minecraft.init.Blocks.PLANKS, 1, 5),       'y', new ItemStack(net.minecraft.init.Items.DYE, 1, 8)));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.big_oak_planks_silver), "xxx","xyx","xxx",'x',new ItemStack(net.minecraft.init.Blocks.PLANKS, 1, 5),     'y', new ItemStack(net.minecraft.init.Items.DYE, 1, 7)));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.big_oak_planks_cyan), "xxx","xyx","xxx",'x',new ItemStack(net.minecraft.init.Blocks.PLANKS, 1, 5),       'y', new ItemStack(net.minecraft.init.Items.DYE, 1, 6)));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.big_oak_planks_purple), "xxx","xyx","xxx",'x',new ItemStack(net.minecraft.init.Blocks.PLANKS, 1, 5),     'y', new ItemStack(net.minecraft.init.Items.DYE, 1, 5)));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.big_oak_planks_blue), "xxx","xyx","xxx",'x',new ItemStack(net.minecraft.init.Blocks.PLANKS, 1, 5),       'y', new ItemStack(net.minecraft.init.Items.DYE, 1, 4)));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.big_oak_planks_brown), "xxx","xyx","xxx",'x',new ItemStack(net.minecraft.init.Blocks.PLANKS, 1, 5),      'y', new ItemStack(net.minecraft.init.Items.DYE, 1, 3)));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.big_oak_planks_green), "xxx","xyx","xxx",'x',new ItemStack(net.minecraft.init.Blocks.PLANKS, 1, 5),      'y', new ItemStack(net.minecraft.init.Items.DYE, 1, 2)));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.big_oak_planks_red), "xxx","xyx","xxx",'x',new ItemStack(net.minecraft.init.Blocks.PLANKS, 1, 5),        'y', new ItemStack(net.minecraft.init.Items.DYE, 1, 1)));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.big_oak_planks_black), "xxx","xyx","xxx",'x',new ItemStack(net.minecraft.init.Blocks.PLANKS, 1, 5),      'y', new ItemStack(net.minecraft.init.Items.DYE, 1, 0)));

		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(net.minecraft.init.Blocks.PLANKS, 1, 5), "xxx","xyx","xxx",'x',new ItemStack(Blocks.big_oak_planks_white),      'y', new ItemStack(net.minecraft.init.Items.WATER_BUCKET, 1, 0)));

		initDone = true;
	}

}
