package dev.j3fftw.litexpansion;

import io.github.thebusybiscuit.slimefun4.utils.SlimefunUtils;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.enchantments.EnchantmentTarget;
import org.bukkit.inventory.ItemStack;

public class NanoBladeActiveEnchant extends Enchantment {

    public NanoBladeActiveEnchant(NamespacedKey key) {
        super(key);
    }

    public String getName() {
        return "��������";
    }

    @Override
    public int getMaxLevel() {
        return 1;
    }

    @Override
    public int getStartLevel() {
        return 1;
    }

    @Override
    public EnchantmentTarget getItemTarget() {
        return EnchantmentTarget.WEAPON;
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
    public boolean conflictsWith(Enchantment enchantment) {
        return false;
    }

    @Override
    public boolean canEnchantItem(ItemStack itemStack) {
        return SlimefunUtils.isItemSimilar(itemStack, Items.NANO_BLADE, false);
    }
}
