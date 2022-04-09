package io.github.sefiraat.networks.slimefun;

import io.github.sefiraat.networks.slimefun.network.NetworkMemoryWiper;
import io.github.sefiraat.networks.slimefun.tools.NetworkCard;
import io.github.sefiraat.networks.slimefun.tools.NetworkRemote;
import io.github.sefiraat.networks.utils.Theme;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.libraries.dough.collections.Pair;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import lombok.experimental.UtilityClass;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import javax.annotation.Nonnull;
import java.text.MessageFormat;

/**
 * Creating SlimefunItemstacks here due to some items being created in Enums so this will
 * act as a one-stop-shop for the stacks themselves.
 */
@UtilityClass
public class NetworksSlimefunItemStacks {

    // Materials
    public static final SlimefunItemStack SYNTHETIC_EMERALD_SHARD;
    public static final SlimefunItemStack OPTIC_GLASS;
    public static final SlimefunItemStack OPTIC_CABLE;
    public static final SlimefunItemStack OPTIC_STAR;
    public static final SlimefunItemStack RADIOACTIVE_OPTIC_STAR;
    public static final SlimefunItemStack SHRINKING_BASE;
    public static final SlimefunItemStack SIMPLE_NANOBOTS;
    public static final SlimefunItemStack ADVANCED_NANOBOTS;
    public static final SlimefunItemStack AI_CORE;
    public static final SlimefunItemStack EMPOWERED_AI_CORE;
    public static final SlimefunItemStack PRISTINE_AI_CORE;
    public static final SlimefunItemStack INTERDIMENSIONAL_PRESENCE;

    // Network Items
    public static final SlimefunItemStack NETWORK_CONTROLLER;
    public static final SlimefunItemStack NETWORK_BRIDGE;
    public static final SlimefunItemStack NETWORK_MONITOR;
    public static final SlimefunItemStack NETWORK_IMPORT;
    public static final SlimefunItemStack NETWORK_EXPORT;
    public static final SlimefunItemStack NETWORK_GRABBER;
    public static final SlimefunItemStack NETWORK_PUSHER;
    public static final SlimefunItemStack NETWORK_PURGER;
    public static final SlimefunItemStack NETWORK_GRID;
    public static final SlimefunItemStack NETWORK_CRAFTING_GRID;
    public static final SlimefunItemStack NETWORK_CELL;
    public static final SlimefunItemStack NETWORK_MEMORY_SHELL;
    public static final SlimefunItemStack NETWORK_QUANTUM_WORKBENCH;
    public static final SlimefunItemStack NETWORK_QUANTUM_STORAGE_1;
    public static final SlimefunItemStack NETWORK_QUANTUM_STORAGE_2;
    public static final SlimefunItemStack NETWORK_QUANTUM_STORAGE_3;
    public static final SlimefunItemStack NETWORK_QUANTUM_STORAGE_4;
    public static final SlimefunItemStack NETWORK_QUANTUM_STORAGE_5;
    public static final SlimefunItemStack NETWORK_QUANTUM_STORAGE_6;
    public static final SlimefunItemStack NETWORK_QUANTUM_STORAGE_7;
    public static final SlimefunItemStack NETWORK_QUANTUM_STORAGE_8;
    public static final SlimefunItemStack NETWORK_MEMORY_WIPER_1;
    public static final SlimefunItemStack NETWORK_MEMORY_WIPER_2;
    public static final SlimefunItemStack NETWORK_MEMORY_WIPER_3;
    public static final SlimefunItemStack NETWORK_MEMORY_WIPER_4;
    public static final SlimefunItemStack NETWORK_CAPACITOR_1;
    public static final SlimefunItemStack NETWORK_CAPACITOR_2;
    public static final SlimefunItemStack NETWORK_POWER_DISPLAY;
    public static final SlimefunItemStack NETWORK_RECIPE_ENCODER;
    public static final SlimefunItemStack NETWORK_AUTO_CRAFTER;
    public static final SlimefunItemStack NETWORK_AUTO_CRAFTER_WITHHOLDING;

    // Tools
    public static final SlimefunItemStack NETWORK_MEMORY_CARD_1;
    public static final SlimefunItemStack NETWORK_MEMORY_CARD_2;
    public static final SlimefunItemStack NETWORK_MEMORY_CARD_3;
    public static final SlimefunItemStack NETWORK_MEMORY_CARD_4;
    public static final SlimefunItemStack NETWORK_MEMORY_CARD_5;
    public static final SlimefunItemStack NETWORK_MEMORY_CARD_6;
    public static final SlimefunItemStack NETWORK_MEMORY_CARD_7;
    public static final SlimefunItemStack NETWORK_MEMORY_CARD_8;
    public static final SlimefunItemStack CRAFTING_BLUEPRINT;
    public static final SlimefunItemStack NETWORK_PROBE;
    public static final SlimefunItemStack NETWORK_REMOTE;
    public static final SlimefunItemStack NETWORK_REMOTE_EMPOWERED;
    public static final SlimefunItemStack NETWORK_REMOTE_PRISTINE;
    public static final SlimefunItemStack NETWORK_REMOTE_ULTIMATE;
    public static final SlimefunItemStack NETWORK_CRAYON;
    public static final SlimefunItemStack NETWORK_CONFIGURATOR;
    public static final SlimefunItemStack NETWORK_RAKE_1;
    public static final SlimefunItemStack NETWORK_RAKE_2;
    public static final SlimefunItemStack NETWORK_RAKE_3;

    static {

        SYNTHETIC_EMERALD_SHARD = Theme.themedSlimefunItemStack(
            "NTW_SYNTHETIC_EMERALD_SHARD",
            new ItemStack(Material.LIME_DYE),
            Theme.CRAFTING,
            "人造绿宝石碎片",
            "一块人造绿宝石的碎片",
            "是信息传输的支柱"
        );

        OPTIC_GLASS = Theme.themedSlimefunItemStack(
            "NTW_OPTIC_GLASS",
            new ItemStack(Material.GLASS),
            Theme.CRAFTING,
            "光学玻璃",
            "能够传输少量信息的玻璃"
        );

        OPTIC_CABLE = Theme.themedSlimefunItemStack(
            "NTW_OPTIC_CABLE",
            new ItemStack(Material.STRING),
            Theme.CRAFTING,
            "光缆",
            "能够传输大量信息的光缆"
        );

        OPTIC_STAR = Theme.themedSlimefunItemStack(
            "NTW_OPTIC_STAR",
            new ItemStack(Material.NETHER_STAR),
            Theme.CRAFTING,
            "光学之星",
            "能够传输大量信息的星"
        );

        RADIOACTIVE_OPTIC_STAR = Theme.themedSlimefunItemStack(
            "NTW_RADIOACTIVE_OPTIC_STAR",
            getPreEnchantedItemStack(Material.NETHER_STAR, true, new Pair<>(Enchantment.ARROW_DAMAGE, 1)),
            Theme.CRAFTING,
            "放射性光学之星",
            "能够传输几乎无限信息的星"
        );

        SHRINKING_BASE = Theme.themedSlimefunItemStack(
            "NTW_SHRINKING_BASE",
            getPreEnchantedItemStack(Material.PISTON, true, new Pair<>(Enchantment.ARROW_DAMAGE, 1)),
            Theme.CRAFTING,
            "缩小底座",
            "可以让大型物体变小的装置"
        );

        SIMPLE_NANOBOTS = Theme.themedSlimefunItemStack(
            "NTW_SIMPLE_NANOBOTS",
            new ItemStack(Material.MELON_SEEDS),
            Theme.CRAFTING,
            "简易纳米机器人",
            "可以帮助你完成精密任务的微型机器人"
        );

        ADVANCED_NANOBOTS = Theme.themedSlimefunItemStack(
            "NTW_ADVANCED_NANOBOTS",
            getPreEnchantedItemStack(Material.MELON_SEEDS, true, new Pair<>(Enchantment.ARROW_DAMAGE, 1)),
            Theme.CRAFTING,
            "高级纳米机器人",
            "可以帮助你完成精密任务的微型机器人",
            "比简易版更智能，更高效"
        );

        AI_CORE = Theme.themedSlimefunItemStack(
            "NTW_AI_CORE",
            new ItemStack(Material.BRAIN_CORAL_BLOCK),
            Theme.CRAFTING,
            "人工智能核心",
            "在脆弱外壳中的初代人工智能"
        );

        EMPOWERED_AI_CORE = Theme.themedSlimefunItemStack(
            "NTW_EMPOWERED_AI_CORE",
            new ItemStack(Material.TUBE_CORAL_BLOCK),
            Theme.CRAFTING,
            "充能人工智能核心",
            "在外壳中的高级人工智能"
        );

        PRISTINE_AI_CORE = Theme.themedSlimefunItemStack(
            "NTW_PRISTINE_AI_CORE",
            getPreEnchantedItemStack(Material.TUBE_CORAL_BLOCK, true, new Pair<>(Enchantment.ARROW_DAMAGE, 1)),
            Theme.CRAFTING,
            "古代人工智能核心",
            "据说是从上古遗迹中挖掘出来的",
            "完美级人工智能"
        );

        INTERDIMENSIONAL_PRESENCE = Theme.themedSlimefunItemStack(
            "NTW_INTERDIMENSIONAL_PRESENCE",
            getPreEnchantedItemStack(Material.ARMOR_STAND, true, new Pair<>(Enchantment.ARROW_DAMAGE, 1)),
            Theme.CRAFTING,
            "跨跃维度的存在",
            "这种完美级的人工智能",
            "甚至还掌握了跨越维度的能力"
        );

        NETWORK_CONTROLLER = Theme.themedSlimefunItemStack(
            "NTW_CONTROLLER",
            new ItemStack(Material.BLACK_STAINED_GLASS),
            Theme.MACHINE,
            "网络控制器",
            "网络控制器是网络的核心部分",
            "每个网络最多有1个控制器"
        );

        NETWORK_BRIDGE = Theme.themedSlimefunItemStack(
            "NTW_BRIDGE",
            new ItemStack(Material.WHITE_STAINED_GLASS),
            Theme.MACHINE,
            "网桥",
            "网桥用于连接不同的网络物品",
            "来形成一个完整的网络"
        );

        NETWORK_MONITOR = Theme.themedSlimefunItemStack(
            "NTW_MONITOR",
            new ItemStack(Material.GREEN_STAINED_GLASS),
            Theme.MACHINE,
            "网络监视器",
            "网络监视器可以与附近的方块交互",
            "让指定方块可以接入网络",
            "",
            "目前支持:",
            "无尽科技 - 存储单元",
            "网络 - 量子存储"
        );

        NETWORK_IMPORT = Theme.themedSlimefunItemStack(
            "NTW_IMPORT",
            new ItemStack(Material.RED_STAINED_GLASS),
            Theme.MACHINE,
            "网络入口",
            "网络入口会将其中的物品送入网络中",
            "每个SF tick可传输最多9组物品",
            "可接收来自货运网络的物品"
        );

        NETWORK_EXPORT = Theme.themedSlimefunItemStack(
            "NTW_EXPORT",
            new ItemStack(Material.BLUE_STAINED_GLASS),
            Theme.MACHINE,
            "网络出口",
            "网络出口可以设置成",
            "持续将1组指定的物品送出网络",
            "可以使用货运网络从中提取物品"
        );

        NETWORK_GRABBER = Theme.themedSlimefunItemStack(
            "NTW_GRABBER",
            new ItemStack(Material.MAGENTA_STAINED_GLASS),
            Theme.MACHINE,
            "网络抓取器",
            "网络抓取器会尝试从",
            "指定的机器中抓取第一个物品"
        );

        NETWORK_PUSHER = Theme.themedSlimefunItemStack(
            "NTW_PUSHER",
            new ItemStack(Material.BROWN_STAINED_GLASS),
            Theme.MACHINE,
            "网络推送器",
            "网络推送器会尝试将",
            "指定的物品送入机器中"
        );

        NETWORK_PURGER = Theme.themedSlimefunItemStack(
            "NTW_TRASH",
            new ItemStack(Material.OBSERVER),
            Theme.MACHINE,
            "网络清除器",
            "网络清除器会从网络中",
            "不断地移除指定物品",
            "清除的物品会立即消失，谨慎使用!"
        );

        NETWORK_GRID = Theme.themedSlimefunItemStack(
            "NTW_GRID",
            new ItemStack(Material.NOTE_BLOCK),
            Theme.MACHINE,
            "网格",
            "网格允许你查看网络中所有的物品",
            "你也可以直接放入或取出物品"
        );

        NETWORK_CRAFTING_GRID = Theme.themedSlimefunItemStack(
            "NTW_CRAFTING_GRID",
            new ItemStack(Material.REDSTONE_LAMP),
            Theme.MACHINE,
            "网格(带合成)",
            "这种网格与普通网格类似",
            "但会显示更少的物品",
            "不过你可以直接使用网络中的物品",
            "进行合成"
        );

        NETWORK_CELL = Theme.themedSlimefunItemStack(
            "NTW_CELL",
            new ItemStack(Material.HONEYCOMB_BLOCK),
            Theme.MACHINE,
            "网络单元",
            "网络单元拥有54格空间(相当于一个大箱子)",
            "可以通过网络访问其中的物品",
            "也可以直接打开"
        );

        NETWORK_MEMORY_SHELL = Theme.themedSlimefunItemStack(
            "NTW_MEMORY_SHELL",
            new ItemStack(Material.DEEPSLATE_TILES),
            Theme.MACHINE,
            "网络读卡器",
            "网络读卡器是一个可以让",
            "网络访问其中内存卡内容的方块"
        );

        NETWORK_QUANTUM_WORKBENCH = Theme.themedSlimefunItemStack(
            "NTW_QUANTUM_WORKBENCH",
            new ItemStack(Material.DRIED_KELP_BLOCK),
            Theme.MACHINE,
            "网络量子工作台",
            "可以合成量子存储"
        );

        NETWORK_QUANTUM_STORAGE_1 = Theme.themedSlimefunItemStack(
            "NTW_QUANTUM_STORAGE_1",
            new ItemStack(Material.WHITE_TERRACOTTA),
            Theme.MACHINE,
            "网络量子存储 (4K)",
            "可存储 " + NetworkCard.getSizes()[0] + " 个物品",
            "",
            "在量子奇点中存储大量物品"
        );

        NETWORK_QUANTUM_STORAGE_2 = Theme.themedSlimefunItemStack(
            "NTW_QUANTUM_STORAGE_2",
            new ItemStack(Material.LIGHT_GRAY_TERRACOTTA),
            Theme.MACHINE,
            "网络量子存储 (32K)",
            "可存储 " + NetworkCard.getSizes()[1] + " 个物品",
            "",
            "在量子奇点中存储大量物品"
        );

        NETWORK_QUANTUM_STORAGE_3 = Theme.themedSlimefunItemStack(
            "NTW_QUANTUM_STORAGE_3",
            new ItemStack(Material.GRAY_TERRACOTTA),
            Theme.MACHINE,
            "网络量子存储 (262K)",
            "可存储 " + NetworkCard.getSizes()[2] + " 个物品",
            "",
            "在量子奇点中存储大量物品"
        );

        NETWORK_QUANTUM_STORAGE_4 = Theme.themedSlimefunItemStack(
            "NTW_QUANTUM_STORAGE_4",
            new ItemStack(Material.BROWN_TERRACOTTA),
            Theme.MACHINE,
            "网络量子存储 (2M)",
            "可存储 " + NetworkCard.getSizes()[3] + " 个物品",
            "",
            "在量子奇点中存储大量物品"
        );

        NETWORK_QUANTUM_STORAGE_5 = Theme.themedSlimefunItemStack(
            "NTW_QUANTUM_STORAGE_5",
            new ItemStack(Material.BLACK_TERRACOTTA),
            Theme.MACHINE,
            "网络量子存储 (16M)",
            "可存储 " + NetworkCard.getSizes()[4] + " 个物品",
            "",
            "在量子奇点中存储大量物品"
        );

        NETWORK_QUANTUM_STORAGE_6 = Theme.themedSlimefunItemStack(
            "NTW_QUANTUM_STORAGE_6",
            new ItemStack(Material.PURPLE_TERRACOTTA),
            Theme.MACHINE,
            "网络量子存储 (134M)",
            "可存储 " + NetworkCard.getSizes()[5] + " 个物品",
            "",
            "在量子奇点中存储大量物品"
        );

        NETWORK_QUANTUM_STORAGE_7 = Theme.themedSlimefunItemStack(
            "NTW_QUANTUM_STORAGE_7",
            new ItemStack(Material.MAGENTA_TERRACOTTA),
            Theme.MACHINE,
            "网络量子存储 (1B)",
            "可存储 " + NetworkCard.getSizes()[6] + " 个物品",
            "",
            "在量子奇点中存储大量物品"
        );

        NETWORK_QUANTUM_STORAGE_8 = Theme.themedSlimefunItemStack(
            "NTW_QUANTUM_STORAGE_8",
            new ItemStack(Material.RED_TERRACOTTA),
            Theme.MACHINE,
            "网络量子存储 (∞)",
            "可存储几乎无限多个物品",
            "",
            "在量子奇点中存储大量物品"
        );

        NETWORK_MEMORY_WIPER_1 = Theme.themedSlimefunItemStack(
            "NTW_MEMORY_WIPER_1",
            new ItemStack(Material.BASALT),
            Theme.MACHINE,
            "网络内存清除器 α",
            "网络内存清除器会不断地",
            "从内存卡中缓慢提取物品",
            "到网络中",
            "",
            MessageFormat.format("{0}速度: {1}{2} 组/t", Theme.CLICK_INFO, Theme.PASSIVE, NetworkMemoryWiper.getStacksToPush()[0])
        );

        NETWORK_MEMORY_WIPER_2 = Theme.themedSlimefunItemStack(
            "NTW_MEMORY_WIPER_2",
            new ItemStack(Material.POLISHED_BASALT),
            Theme.MACHINE,
            "网络内存清除器 β",
            "网络内存清除器会不断地",
            "从内存卡中缓慢提取物品",
            "到网络中",
            "",
            MessageFormat.format("{0}速度: {1}{2} 组/t", Theme.CLICK_INFO, Theme.PASSIVE, NetworkMemoryWiper.getStacksToPush()[1])
        );

        NETWORK_MEMORY_WIPER_3 = Theme.themedSlimefunItemStack(
            "NTW_MEMORY_WIPER_3",
            new ItemStack(Material.SMOOTH_BASALT),
            Theme.MACHINE,
            "网络内存清除器 γ",
            "网络内存清除器会不断地",
            "从内存卡中缓慢提取物品",
            "到网络中",
            "",
            MessageFormat.format("{0}速度: {1}{2} 组/t", Theme.CLICK_INFO, Theme.PASSIVE, NetworkMemoryWiper.getStacksToPush()[2])
        );

        NETWORK_MEMORY_WIPER_4 = Theme.themedSlimefunItemStack(
            "NTW_MEMORY_WIPER_4",
            new ItemStack(Material.POLISHED_BLACKSTONE),
            Theme.MACHINE,
            "网络内存清除器 δ",
            "网络内存清除器会不断地",
            "从内存卡中缓慢提取物品",
            "到网络中",
            "",
            MessageFormat.format("{0}速度: {1}{2} 组/t", Theme.CLICK_INFO, Theme.PASSIVE, NetworkMemoryWiper.getStacksToPush()[3])
        );

        NETWORK_CAPACITOR_1 = Theme.themedSlimefunItemStack(
            "NTW_CAPACITOR_1",
            new ItemStack(Material.BROWN_GLAZED_TERRACOTTA),
            Theme.MACHINE,
            "网络电容 (1)",
            "网络电容可以接收来自",
            "能源网络的电力并存储起来",
            "以供其他网络设备使用",
            "",
            MessageFormat.format("{0}容量: {1}{2}", Theme.CLICK_INFO, Theme.PASSIVE, 1000)
        );

        NETWORK_CAPACITOR_2 = Theme.themedSlimefunItemStack(
            "NTW_CAPACITOR_2",
            new ItemStack(Material.GREEN_GLAZED_TERRACOTTA),
            Theme.MACHINE,
            "网络电容 (2)",
            "网络电容可以接收来自",
            "能源网络的电力并存储起来",
            "以供其他网络设备使用",
            "",
            MessageFormat.format("{0}容量: {1}{2}", Theme.CLICK_INFO, Theme.PASSIVE, 10000)
        );

        NETWORK_POWER_DISPLAY = Theme.themedSlimefunItemStack(
            "NTW_POWER_DISPLAY",
            new ItemStack(Material.TINTED_GLASS),
            Theme.MACHINE,
            "网络电表",
            "网络电表会显示网络中的电力情况",
            "很简单, 对吧?"
        );

        NETWORK_RECIPE_ENCODER = Theme.themedSlimefunItemStack(
            "NTW_RECIPE_ENCODER",
            new ItemStack(Material.TARGET),
            Theme.MACHINE,
            "网络配方编码器",
            "可以根据输入的物品来制作合成蓝图",
            "",
            MessageFormat.format("{0}网络电力消耗: {1}{2} 每次编码", Theme.CLICK_INFO, Theme.PASSIVE, 20000)
        );

        NETWORK_AUTO_CRAFTER = Theme.themedSlimefunItemStack(
            "NTW_AUTO_CRAFTER",
            new ItemStack(Material.BLACK_GLAZED_TERRACOTTA),
            Theme.MACHINE,
            "网络自动合成机",
            "网络自动合成机需要合成蓝图才能工作。",
            "当网络中没有蓝图的目标物品时，",
            "机器会自动从网络中选取材料进行合成",
            "(需要网络中有足够的原材料)",
            "",
            MessageFormat.format("{0}网络电力消耗: {1}{2} 每次合成", Theme.CLICK_INFO, Theme.PASSIVE, 64)
        );

        NETWORK_AUTO_CRAFTER_WITHHOLDING = Theme.themedSlimefunItemStack(
            "NTW_AUTO_CRAFTER_WITHHOLDING",
            new ItemStack(Material.WHITE_GLAZED_TERRACOTTA),
            Theme.MACHINE,
            "网络自动合成机 (预留版)",
            "网络自动合成机需要合成蓝图才能工作。",
            "当网络中没有蓝图的目标物品时，",
            "机器会自动从网络中选取材料进行合成",
            "(需要网络中有足够的原材料)",
            "",
            "预留版的自动合成机会不断进行合成",
            "直到输出栏拥有1组物品",
            "这一组物品可以在网络中访问",
            "也可以通过货运系统取出",
            "",
            MessageFormat.format("{0}网络电力消耗: {1}{2} 每次合成", Theme.CLICK_INFO, Theme.PASSIVE, 128)
        );

        NETWORK_MEMORY_CARD_1 = Theme.themedSlimefunItemStack(
            "NTW_MEMORY_CARD_1",
            new ItemStack(Material.LIGHT_GRAY_DYE),
            Theme.TOOL,
            "网络内存卡 (4K)",
            "可存储 " + NetworkCard.getSizes()[0] + " 物品",
            "",
            "副手中拿着需要设置的物品时",
            "右键点击以设置该卡片使用的物品",
            "只有卡片为空时才能进行设置",
            "",
            Theme.WARNING + "存储满时会丢弃后续输入的物品",
            Theme.WARNING + "升级会清空其中的物品",
            "",
            Theme.WARNING + "空"
        );

        NETWORK_MEMORY_CARD_2 = Theme.themedSlimefunItemStack(
            "NTW_MEMORY_CARD_2",
            new ItemStack(Material.GRAY_DYE),
            Theme.TOOL,
            "网络内存卡 (32K)",
            "可存储 " + NetworkCard.getSizes()[1] + " 物品",
            "",
            "副手中拿着需要设置的物品时",
            "右键点击以设置该卡片使用的物品",
            "只有卡片为空时才能进行设置",
            "",
            Theme.WARNING + "存储满时会丢弃后续输入的物品",
            Theme.WARNING + "升级会清空其中的物品",
            "",
            Theme.WARNING + "空"
        );

        NETWORK_MEMORY_CARD_3 = Theme.themedSlimefunItemStack(
            "NTW_MEMORY_CARD_3",
            new ItemStack(Material.LIME_DYE),
            Theme.TOOL,
            "网络内存卡 (262K)",
            "可存储 " + NetworkCard.getSizes()[2] + " 物品",
            "",
            "副手中拿着需要设置的物品时",
            "右键点击以设置该卡片使用的物品",
            "只有卡片为空时才能进行设置",
            "",
            Theme.WARNING + "存储满时会丢弃后续输入的物品",
            Theme.WARNING + "升级会清空其中的物品",
            "",
            Theme.WARNING + "空"
        );

        NETWORK_MEMORY_CARD_4 = Theme.themedSlimefunItemStack(
            "NTW_MEMORY_CARD_4",
            new ItemStack(Material.GREEN_DYE),
            Theme.TOOL,
            "网络内存卡 (2M)",
            "可存储 " + NetworkCard.getSizes()[3] + " 物品",
            "",
            "副手中拿着需要设置的物品时",
            "右键点击以设置该卡片使用的物品",
            "只有卡片为空时才能进行设置",
            "",
            Theme.WARNING + "存储满时会丢弃后续输入的物品",
            Theme.WARNING + "升级会清空其中的物品",
            "",
            Theme.WARNING + "空"
        );

        NETWORK_MEMORY_CARD_5 = Theme.themedSlimefunItemStack(
            "NTW_MEMORY_CARD_5",
            new ItemStack(Material.LIGHT_BLUE_DYE),
            Theme.TOOL,
            "网络内存卡 (16M)",
            "可存储 " + NetworkCard.getSizes()[4] + " 物品",
            "",
            "副手中拿着需要设置的物品时",
            "右键点击以设置该卡片使用的物品",
            "只有卡片为空时才能进行设置",
            "",
            Theme.WARNING + "存储满时会丢弃后续输入的物品",
            Theme.WARNING + "升级会清空其中的物品",
            "",
            Theme.WARNING + "空"
        );

        NETWORK_MEMORY_CARD_6 = Theme.themedSlimefunItemStack(
            "NTW_MEMORY_CARD_6",
            new ItemStack(Material.BLUE_DYE),
            Theme.TOOL,
            "网络内存卡 (134M)",
            "可存储 " + NetworkCard.getSizes()[5] + " 物品",
            "",
            "副手中拿着需要设置的物品时",
            "右键点击以设置该卡片使用的物品",
            "只有卡片为空时才能进行设置",
            "",
            Theme.WARNING + "存储满时会丢弃后续输入的物品",
            Theme.WARNING + "升级会清空其中的物品",
            "",
            Theme.WARNING + "空"
        );

        NETWORK_MEMORY_CARD_7 = Theme.themedSlimefunItemStack(
            "NTW_MEMORY_CARD_7",
            new ItemStack(Material.PINK_DYE),
            Theme.TOOL,
            "网络内存卡 (1B)",
            "可存储 " + NetworkCard.getSizes()[6] + " 物品",
            "",
            "副手中拿着需要设置的物品时",
            "右键点击以设置该卡片使用的物品",
            "只有卡片为空时才能进行设置",
            "",
            Theme.WARNING + "存储满时会丢弃后续输入的物品",
            Theme.WARNING + "升级会清空其中的物品",
            "",
            Theme.WARNING + "空"
        );

        NETWORK_MEMORY_CARD_8 = Theme.themedSlimefunItemStack(
            "NTW_MEMORY_CARD_8",
            new ItemStack(Material.RED_DYE),
            Theme.TOOL,
            "网络内存卡 (∞)",
            "可无限制存储物品",
            "",
            "副手中拿着需要设置的物品时",
            "右键点击以设置该卡片使用的物品",
            "只有卡片为空时才能进行设置",
            "",
            Theme.WARNING + "存储满时会丢弃后续输入的物品",
            Theme.WARNING + "升级会清空其中的物品",
            "",
            Theme.WARNING + "空"
        );

        CRAFTING_BLUEPRINT = Theme.themedSlimefunItemStack(
            "NTW_CRAFTING_BLUEPRINT",
            new ItemStack(Material.BLUE_DYE),
            Theme.TOOL,
            "合成蓝图",
            "一张空白的蓝图",
            "可以存储一个合成配方"
        );

        NETWORK_PROBE = Theme.themedSlimefunItemStack(
            "NTW_PROBE",
            new ItemStack(Material.CLOCK),
            Theme.TOOL,
            "网络探测器",
            "右键点击网络控制器",
            "可以查看网络中的节点数量"
        );

        NETWORK_REMOTE = Theme.themedSlimefunItemStack(
            "NTW_REMOTE",
            new ItemStack(Material.PAINTING),
            Theme.TOOL,
            "网络远程访问器",
            "远程打开绑定的网格",
            "需要加载网格所在区块",
            "",
            MessageFormat.format("{0}范围: {1}{2}格", Theme.CLICK_INFO, Theme.PASSIVE, NetworkRemote.getRanges()[0])
        );

        NETWORK_REMOTE_EMPOWERED = Theme.themedSlimefunItemStack(
            "NTW_REMOTE_EMPOWERED",
            new ItemStack(Material.ITEM_FRAME),
            Theme.TOOL,
            "充能网络远程访问器",
            "远程打开绑定的网格",
            "需要加载网格所在区块",
            "",
            MessageFormat.format("{0}范围: {1}{2}格", Theme.CLICK_INFO, Theme.PASSIVE, NetworkRemote.getRanges()[1])
        );

        NETWORK_REMOTE_PRISTINE = Theme.themedSlimefunItemStack(
            "NTW_REMOTE_PRISTINE",
            new ItemStack(Material.GLOW_ITEM_FRAME),
            Theme.TOOL,
            "古代网络远程访问器",
            "远程打开绑定的网格",
            "需要加载网格所在区块",
            "",
            MessageFormat.format("{0}范围: {1}{2}", Theme.CLICK_INFO, Theme.PASSIVE, "无限制(仅同一世界)")
        );

        NETWORK_REMOTE_ULTIMATE = Theme.themedSlimefunItemStack(
            "NTW_REMOTE_ULTIMATE",
            getPreEnchantedItemStack(Material.GLOW_ITEM_FRAME, true, new Pair<>(Enchantment.ARROW_DAMAGE, 1)),
            Theme.TOOL,
            "终极网络远程访问器",
            "远程打开绑定的网格",
            "需要加载网格所在区块",
            "",
            MessageFormat.format("{0}范围: {1}{2}", Theme.CLICK_INFO, Theme.PASSIVE, "跨维度")
        );

        NETWORK_CRAYON = Theme.themedSlimefunItemStack(
            "NTW_CRAYON",
            new ItemStack(Material.RED_CANDLE),
            Theme.TOOL,
            "网络绘制器",
            "当对着网络控制器使用时",
            "可以让该网络中的方块展示出粒子效果"
        );

        NETWORK_CONFIGURATOR = Theme.themedSlimefunItemStack(
            "NTW_CONFIGURATOR",
            new ItemStack(Material.BLAZE_ROD),
            Theme.TOOL,
            "网络配置器",
            "用于复制网络部件的设置",
            "可复制带方向选择的网络方块的设置",
            "",
            MessageFormat.format("{0}右键点击: {1}{2}", Theme.CLICK_INFO, Theme.PASSIVE, "应用设置"),
            MessageFormat.format("{0}Shift+右键点击: {1}{2}", Theme.CLICK_INFO, Theme.PASSIVE, "存储设置")
        );

        NETWORK_RAKE_1 = Theme.themedSlimefunItemStack(
            "NTW_RAKE_1",
            new ItemStack(Material.TWISTING_VINES),
            Theme.TOOL,
            "网络扳手 (1)",
            "右键点击一个网络节点",
            "可以立即破坏",
            "",
            LoreBuilder.usesLeft(250)
        );

        NETWORK_RAKE_2 = Theme.themedSlimefunItemStack(
            "NTW_RAKE_2",
            new ItemStack(Material.WEEPING_VINES),
            Theme.TOOL,
            "网络扳手 (2)",
            "右键点击一个网络节点",
            "可以立即破坏",
            "",
            LoreBuilder.usesLeft(1000)
        );

        NETWORK_RAKE_3 = Theme.themedSlimefunItemStack(
            "NTW_RAKE_3",
            getPreEnchantedItemStack(Material.WEEPING_VINES, true, new Pair<>(Enchantment.LUCK, 1)),
            Theme.TOOL,
            "网络扳手 (3)",
            "右键点击一个网络节点",
            "可以立即破坏",
            "",
            LoreBuilder.usesLeft(9999)
        );
    }

    @Nonnull
    @SafeVarargs
    public static ItemStack getPreEnchantedItemStack(Material material, boolean hide, @Nonnull Pair<Enchantment, Integer>... enchantments) {
        ItemStack itemStack = new ItemStack(material);
        ItemMeta itemMeta = itemStack.getItemMeta();
        for (Pair<Enchantment, Integer> pair : enchantments) {
            itemMeta.addEnchant(pair.getFirstValue(), pair.getSecondValue(), true);
        }
        if (hide) {
            itemMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        }
        itemStack.setItemMeta(itemMeta);
        return itemStack;
    }
}
