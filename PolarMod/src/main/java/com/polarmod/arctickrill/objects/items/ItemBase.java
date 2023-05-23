package com.polarmod.arctickrill.objects.items;

import com.polarmod.arctickrill.PolarMod;
import com.polarmod.arctickrill.util.interfaces.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel 
{
	public ItemBase(String name) 
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
	}
	
	@Override
	public void registerModels() 
	{
		PolarMod.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
