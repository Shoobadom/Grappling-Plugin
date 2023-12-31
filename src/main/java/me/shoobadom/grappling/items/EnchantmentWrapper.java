package me.shoobadom.grappling.items;

import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.enchantments.EnchantmentTarget;
import org.bukkit.inventory.ItemStack;

public class EnchantmentWrapper extends Enchantment {
    //private final Grapple plugin = Grapple.getInstance();
    private final String name;
    private final int maxLvl;

    public EnchantmentWrapper(String namespace, String name, int maxLvl) {
        super(NamespacedKey.minecraft(namespace)); // .minecraft creates a Minecraft enchant, not a 'Grapple' enchant
        this.maxLvl = maxLvl;
        this.name=name;

    }

    @Override
    public String getName() {
        return name;
    }



    @Override
    public int getMaxLevel() {
        return maxLvl;
    }

    @Override
    public int getStartLevel() {
        return 0;
    }

    @Override
    public EnchantmentTarget getItemTarget() {
        return null;
    }


    @Override
    public boolean isTreasure() {
        return false;
    }

    @Override
    public boolean isCursed() {
        return false;
    }

    @Override
    public boolean conflictsWith(Enchantment other) {
        return false;
    }

    @Override
    public boolean canEnchantItem(ItemStack item) {
        return true;
    }
}
