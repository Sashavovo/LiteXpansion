package dev.j3fftw.litexpansion;

import io.github.thebusybiscuit.slimefun4.core.attributes.Radioactivity;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import me.mrCookieSlime.Slimefun.cscorelib2.item.CustomItem;
import me.mrCookieSlime.Slimefun.cscorelib2.skull.SkullItem;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;

public final class Items {

    // Category
    public static final Category LITEXPANSION = new Category(
        new NamespacedKey(LiteXpansion.getInstance(), "litexpansion"),
        new CustomItem(SkullItem.fromHash("3f87fc5cbb233743a82fb0fa51fe739487f29bcc01c9026621ecefad197f4fb1"),
            "&7Наноматериалы")
    );

    // Armor

    public static final SlimefunItemStack ELECTRIC_CHESTPLATE = new SlimefunItemStack(
        "ELECTRIC_CHESTPLATE",
        Material.LEATHER_CHESTPLATE, Color.TEAL,
        "&9Электрический Нагрудник",
        "",
        "&8\u21E8 &7Отрицает весь урон, нанесенный игроку.",
        "",
        "&c&o&8\u21E8 &e\u26A1 &70 / 300 J"
    );

    // Weapon

    public static final SlimefunItemStack NANO_BLADE = new SlimefunItemStack(
        "NANO_BLADE",
        Material.DIAMOND_SWORD,
        "&2Нано лезвие",
        "",
        "&fПередовая технология, которая может",
        "&fлегко прорезать органические ткани.",
        "",
        "&fАктивировать: &aПКМ",
        "",
        "&8\u21E8 &7Потребляет &e2.5J &7за удар",
        "",
        "&c&o&8\u21E8 &e\u26A1 &70 / 500 J"
    );

    // Tools

    public static final SlimefunItemStack WRENCH = new SlimefunItemStack(
        "WRENCH",
        Material.GOLDEN_HOE,
        "&6Гаечный ключ"
    );

    // Machines
    public static final SlimefunItemStack SCRAP_MACHINE = new SlimefunItemStack(
        "SCRAP_MACHINE",
        Material.BLACK_CONCRETE,
        "&8Мультисырьевая машина"
    );

    public static final SlimefunItemStack MASS_FABRICATOR_MACHINE = new SlimefunItemStack(
        "MASS_FABRICATOR_MACHINE",
        Material.PURPLE_CONCRETE,
        "&5Генератор Материи"
    );

    // Items

    public static final SlimefunItemStack FOOD_SYNTHESIZER = new SlimefunItemStack(
        "FOOD_SYNTHESIZER",
        new CustomItem(SkullItem.fromHash("a11a2df7d37af40ed5ce442fd2d78cd8ebcdcdc029d2ae691a2b64395cdf"),
            "Food Synthesizer"),
        "&dПищевой синтезатор",
        "",
        "&fКормит вас искусственной пищей.",
        "&fСо специями!",
        "",
        "&c&o&8\u21E8 &e\u26A1 &70 / 100 J"
    );

    public static final SlimefunItemStack MAG_THOR = new SlimefunItemStack(
        "MAG_THOR",
        Material.IRON_INGOT,
        "&b&lМаг-Торий",
        "",
        "&7&oИспользуется чрезвычайно прочный сплав",
        "&7&oтолько на самых передовых машинах"
    );

    public static final SlimefunItemStack THORIUM = new SlimefunItemStack(
        "THORIUM",
        new CustomItem(SkullItem.fromHash("427d1a6184c62d4c4a67f862b8e19ec001abe4c7d889f23349e8dafe6d033"),
            "Thorium"),
        "&8Торий",
        "",
        LoreBuilder.radioactive(Radioactivity.HIGH),
        LoreBuilder.HAZMAT_SUIT_REQUIRED
    );

    public static final SlimefunItemStack SCRAP = new SlimefunItemStack(
        "SCRAP",
        Material.DEAD_BUSH,
        "&8Мультисырье",
        "",
        "&7Может быть использован для создания &5Материи"
    );

    public static final SlimefunItemStack UU_MATTER = new SlimefunItemStack(
        "UU_MATTER",
        Material.PURPLE_DYE,
        "&5Материя",
        "",
        "&7Может использоваться для создания предметов или ресурсов"
    );

    public static final SlimefunItemStack IRIDIUM = new SlimefunItemStack(
        "IRIDIUM",
        Material.WHITE_DYE,
        "&fИридиум"
    );

    public static final SlimefunItemStack IRIDIUM_PLATE = new SlimefunItemStack(
        "IRIDIUM_PLATE",
        Material.PAPER,
        "&fИридиумная пластина",
        "",
        "&7Используется для создания Иридиумной Брони"
    );

    public static final SlimefunItemStack THORIUM_DUST = new SlimefunItemStack(
        "THORIUM_DUST",
        Material.BLACK_DYE,
        "&8Ториевая пыль"
    );

    public static final SlimefunItemStack MAGTHOR_DUST = new SlimefunItemStack(
        "MAGTHOR_DUST",
        Material.LIGHT_GRAY_DYE,
        "&b&lМаг-Ториева пыль"
    );

    public static final SlimefunItemStack REFINED_IRON = new SlimefunItemStack(
        "REFINED_IRON",
        Material.IRON_INGOT,
        "&7Очищенное железо"
    );

    public static final SlimefunItemStack MACHINE_BLOCK = new SlimefunItemStack(
        "MACHINE_BLOCK",
        Material.IRON_BLOCK,
        "&7Машинный Блок"
    );

    private Items() {}
}
