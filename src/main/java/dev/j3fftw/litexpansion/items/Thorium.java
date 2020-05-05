package dev.j3fftw.litexpansion.items;

import dev.j3fftw.litexpansion.Items;
import io.github.thebusybiscuit.slimefun4.core.attributes.Radioactivity;
import io.github.thebusybiscuit.slimefun4.implementation.items.RadioactiveItem;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.cscorelib2.item.CustomItem;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class Thorium extends RadioactiveItem {

    private static final ItemStack thorium = new CustomItem(Material.PAPER, "&fСовет!",
        "&a&oОбязательно сначала GEO-Scan чанк, в котором вы находитесь", "&a&o!");

    public Thorium() {
        super(Items.LITEXPANSION, Radioactivity.HIGH, Items.THORIUM, RecipeType.GEO_MINER, new ItemStack[] {
                null, null, null,
                null, thorium, null,
                null, null, null
            }
        );

    }

}
