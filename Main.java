package de.GameCubeMC.www;

import net.md_5.bungee.api.ChatColor;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Main extends JavaPlugin {

	public void onEnable() {
		Bukkit.getServer().getPluginManager().registerEvents(new Events(this), this);
		loadConfig();

	}

	public void loadConfig() {
		saveDefaultConfig();

	}

	@SuppressWarnings("deprecation")
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player p = null;
		if ((sender instanceof Player)) {
			p = (Player) sender;
		}

		if (cmd.getName().equalsIgnoreCase("fm")) {
			if (p != null) {
				p.sendMessage("");
				p.sendMessage("§a=========§3FunMessages§a=========");
				p.sendMessage("§6Plugin by§9: §3Tobias Kewitz");
				p.sendMessage("§eCommands: /fm-cmds-§c<§71§c|§72§c|§73§c|§74§c>");
				p.sendMessage("§a=========§3FunMessages§a=========");
				p.sendMessage("");
				p.playSound(p.getLocation(), Sound.BLOCK_NOTE_PLING, 1.0F, 1.0F);
				return true;
			}
			sender.sendMessage("§4Only players are allowed to do this.");
			return true;
		}

		if (cmd.getName().equalsIgnoreCase("fm-list")) {
			if (p != null) {
				p.sendMessage("");
				p.sendMessage("§a=========§3FunMessages§8-§2List§a=========");
				p.sendMessage("§6Death§8: §cYou §4died§8!");
				p.sendMessage("§6Bucket Empty§8: §cThe Bucket is now Empty§8!");
				p.sendMessage("§6Bucket full§8: §aThe Bucket is now Full§8!");
				p.sendMessage("§6Throw egg§8: §eSpiegeleier§8!");
				p.sendMessage("§6Gamemode change§8: §eLast Gamemode: §6<last GameMode>");
				p.sendMessage("§6Respawn§8: §2New Try §8....");
				p.sendMessage("§6Angeln§8: §bhmmmm .... §3Fish §8;)");
				p.sendMessage("§6Achievment§8: §2Gratulation§c! §aYou earned the achievment: §7<achievment>§8!");
				p.sendMessage("§6Went into Bed§8: §aGood Nigth!");
				p.sendMessage("§6Leave Bed§8: §aGood Morning!");
				p.sendMessage("§6Server-Join§8: §2Welcome back, <name>!");
				p.sendMessage("§6Kick§8: §4<name> §cwas kicked§8!");
				p.sendMessage("§6In Portal§8: §cDo you really want that§8?");
				p.sendMessage("§6World change§8: §aWorld changed§8!");
				p.sendMessage("§6Server-join§8: §8[§2+§8] §2<name>");
				p.sendMessage("§6Server-leave§8: §8[§4-§8] §4<name>");
				p.sendMessage("§6Tier tame§8: §aThats now your pet§8! §eOwner§7: §e<name>");
				p.sendMessage("§6Mob / Player Kill§8: §cYou have §4killed §ca §d <Mob-Name> §c!");
				p.sendMessage("§a=========§3FunMessages§8-§2List§a=========");
				p.sendMessage("");
				p.playSound(p.getLocation(), Sound.BLOCK_NOTE_PLING, 1.0F, 1.0F);
				return true;
			}
			sender.sendMessage("§4Only players are allowed to do this.");
			return true;
		}

		if (cmd.getName().equalsIgnoreCase("fm-cmds-1")) {
			if (p != null) {
				p.sendMessage("");
				p.sendMessage("§a=========§3FunMessages§8-§2Commands§a=========");
				p.sendMessage("§7- §6/fm");
				p.sendMessage("§7- §6/fm-list");
				p.sendMessage("§7- §6/fm-cmds");
				p.sendMessage("§7- §6/fm-death");
				p.sendMessage("§7- §6/fm-bempty");
				p.sendMessage("§7- §6/fm-bfull");
				p.sendMessage("§7- §6/fm-egg");
				p.sendMessage("§7- §6/fm-gamemode");
				p.sendMessage("§7- §6/fm-respawn");
				p.sendMessage("§7- §6/fm-fish");
				p.sendMessage("§7- §6/fm-bedenter");
				p.sendMessage("§7- §6/fm-bedleave");
				p.sendMessage("§7- §6/fm-join");
				p.sendMessage("§7- §6/fm-leave");
				p.sendMessage("");
				p.sendMessage("§bNext page§8>> §6/fm-cmds-2");
				p.sendMessage("§a=========§3FunMessages§8-§2Commands§a=========");
				p.sendMessage("");
				p.playSound(p.getLocation(), Sound.BLOCK_NOTE_HAT, 1.0F, 1.0F);
				return true;
			}
			sender.sendMessage("§4Only players are allowed to do this.");
			return true;
		}

		if (cmd.getName().equalsIgnoreCase("fm-cmds-2")) {
			if (p != null) {
				p.sendMessage("");
				p.sendMessage("§a=========§3FunMessages§8-§2Commands§a=========");
				p.sendMessage("§7- §6/fm-kick");
				p.sendMessage("§7- §6/fm-portal");
				p.sendMessage("§7- §6/fm-world");
				p.sendMessage("§7- §6/fm-tame");
				p.sendMessage("§7- §6/fm-kill");
				p.sendMessage("§7- §6/fm-cc");
				p.sendMessage("§7- §6/fm-coc");
				p.sendMessage("§7- §6/fm-ospam");
				p.sendMessage("§7- §6/fm-spam");
				p.sendMessage(
						"§7- §6/fm-h10 §7| §615 §7| §620 §7| §630 §7| §640 §7| §650 §7| §660 §7| §670 §7| §680 §7| §690 §7| §6100");
				p.sendMessage("§7- §6/fm-hreset");
				p.sendMessage("§7- §6/fm-heal");
				p.sendMessage("§7- §6/fm-pkill");
				p.sendMessage("§7- §6/fm-fuck");
				p.sendMessage("");
				p.sendMessage("§bNext page§8>> §6/fm-cmds-3");
				p.sendMessage("§a=========§3FunMessages§8-§2Commands§a=========");
				// p.sendMessage("");
				p.playSound(p.getLocation(), Sound.BLOCK_NOTE_HAT, 1.0F, 1.0F);
				return true;
			}
			sender.sendMessage("§4Only players are allowed to do this.");
			return true;
		}

		if (cmd.getName().equalsIgnoreCase("fm-cmds-3")) {
			if (p != null) {
				p.sendMessage("");
				p.sendMessage("§a=========§3FunMessages§8-§2Commands§a=========");
				p.sendMessage("§7- §6/fm-uuid");
				p.sendMessage("§7- §6/fm-ip");
				p.sendMessage("§7- §6/fm-fly-on");
				p.sendMessage("§7- §6/fm-fly-off");
				p.sendMessage("§7- §6/fm-jump-on");
				p.sendMessage("§7- §6/fm-jump-off");
				p.sendMessage("§7- §6/fm-gm-0");
				p.sendMessage("§7- §6/fm-gm-1");
				p.sendMessage("§7- §6/fm-gm-2");
				p.sendMessage("§7- §6/fm-gm-3");
				p.sendMessage("§7- §6/fm-strengh-on");
				p.sendMessage("§7- §6/fm-strengh-off");
				p.sendMessage("§7- §6/fm-invis-on");
				p.sendMessage("§7- §6/fm-invis-off");
				p.sendMessage("");
				p.sendMessage("§bNext page§8>> §6/fm-cmds-4");
				p.sendMessage("§a=========§3FunMessages§8-§2Commands§a=========");
				p.sendMessage("");
				p.playSound(p.getLocation(), Sound.BLOCK_NOTE_HAT, 1.0F, 1.0F);
				return true;
			}
			sender.sendMessage("§4Only players are allowed to do this.");
			return true;
		}

		if (cmd.getName().equalsIgnoreCase("fm-cmds-4")) {
			if (p != null) {
				p.sendMessage("");
				p.sendMessage("§a=========§3FunMessages§8-§2Commands§a=========");
				p.sendMessage("§7- §6/fm-reload");
				p.sendMessage("§7- §6/fm-server");
				p.sendMessage("§7- §6/fm-hat");
				p.sendMessage("§7- §6/fm-clearEC");
				p.sendMessage("§7- §6/fm-items");
				p.sendMessage("§7- §6/fm-reloadCFG");
				p.sendMessage("§7- §6/fm-playerinfo");
				p.sendMessage("§7- §6/fm-hero");
				p.sendMessage("§7- §6/fm-noob");
				p.sendMessage("§7- §6/fm-noob-off");
				p.sendMessage("§7- §6/fm-troll");
				p.sendMessage("§7- §6/fm-trump");
				p.sendMessage("§7- §6/fm-support");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("§bNext page§8>> §6No Page yet!");
				p.sendMessage("§a=========§3FunMessages§8-§2Commands§a=========");
				p.sendMessage("");
				p.playSound(p.getLocation(), Sound.BLOCK_NOTE_HAT, 1.0F, 1.0F);
				return true;
			}
			sender.sendMessage("§4Only players are allowed to do this.");
			return true;
		}

		if (cmd.getName().equalsIgnoreCase("fm-death")) {
			String fm_death = getConfig().getString("Config.fm_death");
			if (p != null) {
				p.sendMessage("");
				p.sendMessage("§a=========§3FunMessages§a=========");
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', fm_death));
				p.sendMessage("§a=========§3FunMessages§a=========");
				p.sendMessage("");
				p.playSound(p.getLocation(), Sound.ENTITY_WITHER_DEATH, 1.0F, 1.0F);
				return true;
			}
			sender.sendMessage("§4Only players are allowed to do this.");
			return true;
		}

		if (cmd.getName().equalsIgnoreCase("fm-bempty")) {
			String fm_bempty = getConfig().getString("Config.fm_bempty");
			if (p != null) {
				p.sendMessage("");
				p.sendMessage("§a=========§3FunMessages§a=========");
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', fm_bempty));
				p.sendMessage("§a=========§3FunMessages§a=========");
				p.sendMessage("");
				p.playSound(p.getLocation(), Sound.ENTITY_WOLF_GROWL, 1.0F, 1.0F);
				return true;
			}
			sender.sendMessage("§4Only players are allowed to do this.");
			return true;
		}

		if (cmd.getName().equalsIgnoreCase("fm-bfull")) {
			String fm_bfull = getConfig().getString("Config.fm_bfull");
			if (p != null) {
				p.sendMessage("");
				p.sendMessage("§a=========§3FunMessages§a=========");
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', fm_bfull));
				p.sendMessage("§a=========§3FunMessages§a=========");
				p.sendMessage("");
				p.playSound(p.getLocation(), Sound.ENTITY_WOLF_WHINE, 1.0F, 1.0F);
				return true;
			}
			sender.sendMessage("§4Nope");
			return true;
		}

		if (cmd.getName().equalsIgnoreCase("fm-egg")) {
			String fm_egg = getConfig().getString("Config.fm_egg");
			if (p != null) {
				p.sendMessage("");
				p.sendMessage("§a=========§3FunMessages§a=========");
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', fm_egg));
				p.sendMessage("§a=========§3FunMessages§a=========");
				p.sendMessage("");
				p.playSound(p.getLocation(), Sound.ENTITY_GENERIC_EXPLODE, 1.0F, 1.0F);
				return true;
			}
			sender.sendMessage("§4Nope");
			return true;
		}

		if (cmd.getName().equalsIgnoreCase("fm-gamemode")) {
			String fm_gamemode = getConfig().getString("Config.fm_gamemode");
			if (p != null) {
				p.sendMessage("");
				p.sendMessage("§a=========§3FunMessages§a=========");
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', fm_gamemode));
				p.sendMessage("§a=========§3FunMessages§a=========");
				p.sendMessage("");
				p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_LAND, 1.0F, 1.0F);
				return true;
			}
			sender.sendMessage("§4Nope");
			return true;
		}

		if (cmd.getName().equalsIgnoreCase("fm-respawn")) {
			String fm_respawn = getConfig().getString("Config.fm_respawn");
			if (p != null) {
				p.sendMessage("");
				p.sendMessage("§a=========§3FunMessages§a=========");
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', fm_respawn));
				p.sendMessage("§a=========§3FunMessages§a=========");
				p.sendMessage("");
				p.playSound(p.getLocation(), Sound.ENTITY_ARROW_SHOOT, 1.0F, 1.0F);
				return true;
			}
			sender.sendMessage("§4Nope");
			return true;
		}

		if (cmd.getName().equalsIgnoreCase("fm-fish")) {
			String fm_fish = getConfig().getString("Config.fm_fish");
			if (p != null) {
				p.sendMessage("");
				p.sendMessage("§a=========§3FunMessages§a=========");
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', fm_fish));
				p.sendMessage("§a=========§3FunMessages§a=========");
				p.sendMessage("");
				p.playSound(p.getLocation(), Sound.ENTITY_SHEEP_SHEAR, 1.0F, 1.0F);
				return true;
			}
			sender.sendMessage("§4Nope");
			return true;
		}

		if (cmd.getName().equalsIgnoreCase("fm-achievment")) {
			String fm_achievment = getConfig().getString("Config.fm_achievment");
			if (p != null) {
				p.sendMessage("");
				p.sendMessage("§a=========§3FunMessages§a=========");
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', fm_achievment));
				p.sendMessage("§a=========§3FunMessages§a=========");
				p.sendMessage("");
				p.playSound(p.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
				return true;
			}
			sender.sendMessage("§4Nope");
			return true;
		}

		if (cmd.getName().equalsIgnoreCase("fm-bedenter")) {
			String fm_bedenter = getConfig().getString("Config.fm_bedenter");
			if (p != null) {
				p.sendMessage("");
				p.sendMessage("§a=========§3FunMessages§a=========");
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', fm_bedenter));
				p.sendMessage("§a=========§3FunMessages§a=========");
				p.sendMessage("");
				p.playSound(p.getLocation(), Sound.ENTITY_CREEPER_DEATH, 1.0F, 1.0F);
				return true;
			}
			sender.sendMessage("§4Nope");
			return true;
		}

		if (cmd.getName().equalsIgnoreCase("fm-bedleave")) {
			String fm_bedleave = getConfig().getString("Config.fm_bedleave");
			if (p != null) {
				p.sendMessage("");
				p.sendMessage("§a=========§3FunMessages§a=========");
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', fm_bedleave));
				p.sendMessage("§a=========§3FunMessages§a=========");
				p.sendMessage("");
				p.playSound(p.getLocation(), Sound.ENTITY_CREEPER_PRIMED, 1.0F, 1.0F);
				return true;
			}
			sender.sendMessage("§4Nope");
			return true;
		}

		if (cmd.getName().equalsIgnoreCase("fm-join")) {
			String fm_join = getConfig().getString("Config.fm_join");
			if (p != null) {
				p.sendMessage("");
				p.sendMessage("§a=========§3FunMessages§a=========");
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', fm_join));
				p.sendMessage("§a=========§3FunMessages§a=========");
				p.sendMessage("");
				p.playSound(p.getLocation(), Sound.BLOCK_CHEST_OPEN, 1.0F, 1.0F);
				return true;
			}
			sender.sendMessage("§4Nope");
			return true;
		}

		if (cmd.getName().equalsIgnoreCase("fm-leave")) {
			if (p != null) {
				p.sendMessage("");
				p.sendMessage("§a=========§3FunMessages§a=========");
				p.sendMessage("§cThere is no sound §4:p");
				p.sendMessage("§a=========§3FunMessages§a=========");
				p.sendMessage("");
				p.playSound(p.getLocation(), Sound.WEATHER_RAIN_ABOVE, 1.0F, 1.0F);
				return true;
			}
			sender.sendMessage("§4Nope");
			return true;
		}

		if (cmd.getName().equalsIgnoreCase("fm-kick")) {
			String fm_kick = getConfig().getString("Config.fm_kick");
			if (p != null) {
				p.sendMessage("");
				p.sendMessage("§a=========§3FunMessages§a=========");
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', fm_kick));
				p.sendMessage("§a=========§3FunMessages§a=========");
				p.sendMessage("");
				p.playSound(p.getLocation(), Sound.BLOCK_CHEST_CLOSE, 1.0F, 1.0F);
				return true;
			}
			sender.sendMessage("§4Nope");
			return true;
		}

		if (cmd.getName().equalsIgnoreCase("fm-portal")) {
			String fm_portal = getConfig().getString("Config.fm_portal");
			if (p != null) {
				p.sendMessage("");
				p.sendMessage("§a=========§3FunMessages§a=========");
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', fm_portal));
				p.sendMessage("§a=========§3FunMessages§a=========");
				p.sendMessage("");
				p.playSound(p.getLocation(), Sound.ENTITY_BLAZE_AMBIENT, 1.0F, 1.0F);
				return true;
			}
			sender.sendMessage("§4Nope");
			return true;
		}

		if (cmd.getName().equalsIgnoreCase("fm-world")) {
			String fm_world = getConfig().getString("Config.fm_world");
			if (p != null) {
				p.sendMessage("");
				p.sendMessage("§a=========§3FunMessages§a=========");
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', fm_world));
				p.sendMessage("§a=========§3FunMessages§a=========");
				p.sendMessage("");
				p.playSound(p.getLocation(), Sound.ENTITY_ENDERMEN_TELEPORT, 1.0F, 1.0F);
				return true;
			}
			sender.sendMessage("§4Nope");
			return true;
		}

		if (cmd.getName().equalsIgnoreCase("fm-tame")) {
			String fm_tame = getConfig().getString("Config.fm_tame");
			if (p != null) {
				p.sendMessage("");
				p.sendMessage("§a=========§3FunMessages§a=========");
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', fm_tame));
				p.sendMessage("§a=========§3FunMessages§a=========");
				p.sendMessage("");
				p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_USE, 1.0F, 1.0F);
				return true;
			}
			sender.sendMessage("§4Nope");
			return true;
		}

		if (cmd.getName().equalsIgnoreCase("fm-kill")) {
			String fm_kill = getConfig().getString("Config.fm_kill");
			if (p != null) {
				p.sendMessage("");
				p.sendMessage("§a=========§3FunMessages§a=========");
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', fm_kill));
				p.sendMessage("§a=========§3FunMessages§a=========");
				p.sendMessage("");
				p.playSound(p.getLocation(), Sound.ENTITY_ENDERDRAGON_GROWL, 1.0F, 1.0F);
				return true;
			}
			sender.sendMessage("§4Nope");
			return true;
		}

		if (cmd.getName().equalsIgnoreCase("fm-cc")) {
			String no_perm = getConfig().getString("Config.no_perm");
			String fm_cc_message = getConfig().getString("Config.fm_cc_message");
			if (p != null)

				if (!(p.hasPermission("fm.clearchat"))) {
					p.sendMessage(ChatColor.translateAlternateColorCodes('&', no_perm));
				}

			if (p.hasPermission("fm.clearchat"))
				;
			{
				p.sendMessage("");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', fm_cc_message));
				p.playSound(p.getLocation(), Sound.ENTITY_BAT_LOOP, 1.0F, 1.0F);
				return true;
			}
		}

		if (cmd.getName().equalsIgnoreCase("fm-coc")) {
			String no_perm = getConfig().getString("Config.no_perm");
			String fm_coc_message = getConfig().getString("Config.fm_coc_message");
			if (p != null)

				if (!(p.hasPermission("fm.coc"))) {
					p.sendMessage(ChatColor.translateAlternateColorCodes('&', no_perm));
				}

			if (p.hasPermission("fm.coc"))
				;
			{
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', fm_coc_message));
				p.playSound(p.getLocation(), Sound.ENTITY_BAT_TAKEOFF, 1.0F, 1.0F);
				return true;
			}
		}

		if (cmd.getName().equalsIgnoreCase("fm-ospam")) {
			String no_perm = getConfig().getString("Config.no_perm");
			String fm_ospam = getConfig().getString("Config.fm_ospam");
			if (p != null)

				if (!(p.hasPermission("fm.ospam"))) {
					p.sendMessage(ChatColor.translateAlternateColorCodes('&', no_perm));
				}

			if (p.hasPermission("fm.ospam"))
				;
			{
				p.sendMessage("§cSpam");
				p.sendMessage("§eHi");
				p.sendMessage("§6Dude");
				p.sendMessage("§5eewe");
				p.sendMessage("§7rth");
				p.sendMessage("§7ztj");
				p.sendMessage("§7ztz");
				p.sendMessage("§7erreg");
				p.sendMessage("§7eeewe");
				p.sendMessage("§7efwew");
				p.sendMessage("§7ewfw");
				p.sendMessage("§7fewq");
				p.sendMessage("§7fefe");
				p.sendMessage("§7wefw");
				p.sendMessage("§73thrh");
				p.sendMessage("§73t48et4");
				p.sendMessage("§73eth7e");
				p.sendMessage("§7erhe47g");
				p.sendMessage("§7re48");
				p.sendMessage("§7gre7g4re");
				p.sendMessage("§7g7er8");
				p.sendMessage("§74g78r");
				p.sendMessage("§74ger");
				p.sendMessage("§cSpam");
				p.sendMessage("§eHi");
				p.sendMessage("§6Dude");
				p.sendMessage("§5eewe");
				p.sendMessage("§7rth");
				p.sendMessage("§7ztj");
				p.sendMessage("§7ztz");
				p.sendMessage("§7erreg");
				p.sendMessage("§7eeewe");
				p.sendMessage("§7efwew");
				p.sendMessage("§7ewfw");
				p.sendMessage("§7fewq");
				p.sendMessage("§7fefe");
				p.sendMessage("§7wefw");
				p.sendMessage("§73thrh");
				p.sendMessage("§73t48et4");
				p.sendMessage("§73eth7e");
				p.sendMessage("§7erhe47g");
				p.sendMessage("§7re48");
				p.sendMessage("§7gre7g4re");
				p.sendMessage("§7g7er8");
				p.sendMessage("§74g78r");
				p.sendMessage("§74ger");
				p.sendMessage("§cSpam");
				p.sendMessage("§eHi");
				p.sendMessage("§6Dude");
				p.sendMessage("§5eewe");
				p.sendMessage("§7rth");
				p.sendMessage("§7ztj");
				p.sendMessage("§7ztz");
				p.sendMessage("§7erreg");
				p.sendMessage("§7eeewe");
				p.sendMessage("§7efwew");
				p.sendMessage("§7ewfw");
				p.sendMessage("§7fewq");
				p.sendMessage("§7fefe");
				p.sendMessage("§7wefw");
				p.sendMessage("§73thrh");
				p.sendMessage("§73t48et4");
				p.sendMessage("§73eth7e");
				p.sendMessage("§7erhe47g");
				p.sendMessage("§7re48");
				p.sendMessage("§7gre7g4re");
				p.sendMessage("§7g7er8");
				p.sendMessage("§74g78r");
				p.sendMessage("§74ger");
				p.sendMessage("§cSpam");
				p.sendMessage("§eHi");
				p.sendMessage("§6Dude");
				p.sendMessage("§5eewe");
				p.sendMessage("§7rth");
				p.sendMessage("§7ztj");
				p.sendMessage("§7ztz");
				p.sendMessage("§7erreg");
				p.sendMessage("§7eeewe");
				p.sendMessage("§7efwew");
				p.sendMessage("§7ewfw");
				p.sendMessage("§7fewq");
				p.sendMessage("§7fefe");
				p.sendMessage("§7wefw");
				p.sendMessage("§73thrh");
				p.sendMessage("§73t48et4");
				p.sendMessage("§73eth7e");
				p.sendMessage("§7erhe47g");
				p.sendMessage("§7re48");
				p.sendMessage("§7gre7g4re");
				p.sendMessage("§7g7er8");
				p.sendMessage("§74g78r");
				p.sendMessage("§74ger");
				p.sendMessage("§cSpam");
				p.sendMessage("§eHi");
				p.sendMessage("§6Dude");
				p.sendMessage("§5eewe");
				p.sendMessage("§7rth");
				p.sendMessage("§7ztj");
				p.sendMessage("§7ztz");
				p.sendMessage("§7erreg");
				p.sendMessage("§7eeewe");
				p.sendMessage("§7efwew");
				p.sendMessage("§7ewfw");
				p.sendMessage("§7fewq");
				p.sendMessage("§7fefe");
				p.sendMessage("§7wefw");
				p.sendMessage("§73thrh");
				p.sendMessage("§73t48et4");
				p.sendMessage("§73eth7e");
				p.sendMessage("§7erhe47g");
				p.sendMessage("§7re48");
				p.sendMessage("§7gre7g4re");
				p.sendMessage("§7g7er8");
				p.sendMessage("§74g78r");
				p.sendMessage("§74ger");
				p.sendMessage("§cSpam");
				p.sendMessage("§eHi");
				p.sendMessage("§6Dude");
				p.sendMessage("§5eewe");
				p.sendMessage("§7rth");
				p.sendMessage("§7ztj");
				p.sendMessage("§7ztz");
				p.sendMessage("§7erreg");
				p.sendMessage("§7eeewe");
				p.sendMessage("§7efwew");
				p.sendMessage("§7ewfw");
				p.sendMessage("§7fewq");
				p.sendMessage("§7fefe");
				p.sendMessage("§7wefw");
				p.sendMessage("§73thrh");
				p.sendMessage("§73t48et4");
				p.sendMessage("§73eth7e");
				p.sendMessage("§7erhe47g");
				p.sendMessage("§7re48");
				p.sendMessage("§7gre7g4re");
				p.sendMessage("§7g7er8");
				p.sendMessage("§74g78r");
				p.sendMessage("§74ger");
				p.sendMessage("§cSpam");
				p.sendMessage("§eHi");
				p.sendMessage("§6Dude");
				p.sendMessage("§5eewe");
				p.sendMessage("§7rth");
				p.sendMessage("§7ztj");
				p.sendMessage("§7ztz");
				p.sendMessage("§7erreg");
				p.sendMessage("§7eeewe");
				p.sendMessage("§7efwew");
				p.sendMessage("§7ewfw");
				p.sendMessage("§7fewq");
				p.sendMessage("§7fefe");
				p.sendMessage("§7wefw");
				p.sendMessage("§73thrh");
				p.sendMessage("§73t48et4");
				p.sendMessage("§73eth7e");
				p.sendMessage("§7erhe47g");
				p.sendMessage("§7re48");
				p.sendMessage("§7gre7g4re");
				p.sendMessage("§7g7er8");
				p.sendMessage("§74g78r");
				p.sendMessage("§74ger");
				p.sendMessage("§cSpam");
				p.sendMessage("§eHi");
				p.sendMessage("§6Dude");
				p.sendMessage("§5eewe");
				p.sendMessage("§7rth");
				p.sendMessage("§7ztj");
				p.sendMessage("§7ztz");
				p.sendMessage("§7erreg");
				p.sendMessage("§7eeewe");
				p.sendMessage("§7efwew");
				p.sendMessage("§7ewfw");
				p.sendMessage("§7fewq");
				p.sendMessage("§7fefe");
				p.sendMessage("§7wefw");
				p.sendMessage("§73thrh");
				p.sendMessage("§73t48et4");
				p.sendMessage("§73eth7e");
				p.sendMessage("§7erhe47g");
				p.sendMessage("§7re48");
				p.sendMessage("§7gre7g4re");
				p.sendMessage("§7g7er8");
				p.sendMessage("§74g78r");
				p.sendMessage("§74ger");
				p.sendMessage("§cSpam");
				p.sendMessage("§eHi");
				p.sendMessage("§6Dude");
				p.sendMessage("§5eewe");
				p.sendMessage("§7rth");
				p.sendMessage("§7ztj");
				p.sendMessage("§7ztz");
				p.sendMessage("§7erreg");
				p.sendMessage("§7eeewe");
				p.sendMessage("§7efwew");
				p.sendMessage("§7ewfw");
				p.sendMessage("§7fewq");
				p.sendMessage("§7fefe");
				p.sendMessage("§7wefw");
				p.sendMessage("§73thrh");
				p.sendMessage("§73t48et4");
				p.sendMessage("§73eth7e");
				p.sendMessage("§7erhe47g");
				p.sendMessage("§7re48");
				p.sendMessage("§7gre7g4re");
				p.sendMessage("§7g7er8");
				p.sendMessage("§74g78r");
				p.sendMessage("§74ger");
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', fm_ospam));
				p.playSound(p.getLocation(), Sound.ENTITY_BAT_TAKEOFF, 1.0F, 1.0F);
				return true;
			}
		}

		if (cmd.getName().equalsIgnoreCase("fm-spam")) {
			String no_perm = getConfig().getString("Config.no_perm");
			String fm_spam = getConfig().getString("Config.fm_spam");
			fm_spam = fm_spam.replace("[NAME]", p.getName());
			if (p != null)

				if (!(p.hasPermission("fm.spam"))) {
					p.sendMessage(ChatColor.translateAlternateColorCodes('&', no_perm));
				}

			if (p.hasPermission("fm.spam"))
				;
			{

				p.sendMessage("");
				Bukkit.broadcastMessage("rfwef");
				Bukkit.broadcastMessage("ewfw");
				Bukkit.broadcastMessage("ewewfwregregrgkerok");
				Bukkit.broadcastMessage("nwefuhwepuf");
				Bukkit.broadcastMessage("489e4fe9w8");
				Bukkit.broadcastMessage("wefwefwpöi.-,");
				Bukkit.broadcastMessage(".öoo.iz");
				Bukkit.broadcastMessage("4984wef984");
				Bukkit.broadcastMessage("4wfe8984");
				Bukkit.broadcastMessage("1f77841ew86");
				Bukkit.broadcastMessage("1fewe4f8we4");
				Bukkit.broadcastMessage("<ewqfwrf");
				Bukkit.broadcastMessage("gehbnrmk,");
				Bukkit.broadcastMessage("3r20ur80j0");
				Bukkit.broadcastMessage("wef23ri0ß0f");
				Bukkit.broadcastMessage("32r892hfß0i");
				Bukkit.broadcastMessage("3roj2390fdjweopk,");
				Bukkit.broadcastMessage("rfwef");
				Bukkit.broadcastMessage("ewfw");
				Bukkit.broadcastMessage("ewewfwregregrgkerok");
				Bukkit.broadcastMessage("nwefuhwepuf");
				Bukkit.broadcastMessage("489e4fe9w8");
				Bukkit.broadcastMessage("wefwefwpöi.-,");
				Bukkit.broadcastMessage(".öoo.iz");
				Bukkit.broadcastMessage("4984wef984");
				Bukkit.broadcastMessage("4wfe8984");
				Bukkit.broadcastMessage("1f77841ew86");
				Bukkit.broadcastMessage("1fewe4f8we4");
				Bukkit.broadcastMessage("<ewqfwrf");
				Bukkit.broadcastMessage("gehbnrmk,");
				Bukkit.broadcastMessage("3r20ur80j0");
				Bukkit.broadcastMessage("wef23ri0ß0f");
				Bukkit.broadcastMessage("32r892hfß0i");
				Bukkit.broadcastMessage("3roj2390fdjweopk,");
				Bukkit.broadcastMessage("rfwef");
				Bukkit.broadcastMessage("ewfw");
				Bukkit.broadcastMessage("ewewfwregregrgkerok");
				Bukkit.broadcastMessage("nwefuhwepuf");
				Bukkit.broadcastMessage("489e4fe9w8");
				Bukkit.broadcastMessage("wefwefwpöi.-,");
				Bukkit.broadcastMessage(".öoo.iz");
				Bukkit.broadcastMessage("4984wef984");
				Bukkit.broadcastMessage("4wfe8984");
				Bukkit.broadcastMessage("1f77841ew86");
				Bukkit.broadcastMessage("1fewe4f8we4");
				Bukkit.broadcastMessage("<ewqfwrf");
				Bukkit.broadcastMessage("gehbnrmk,");
				Bukkit.broadcastMessage("3r20ur80j0");
				Bukkit.broadcastMessage("wef23ri0ß0f");
				Bukkit.broadcastMessage("32r892hfß0i");
				Bukkit.broadcastMessage("3roj2390fdjweopk,");
				Bukkit.broadcastMessage("rfwef");
				Bukkit.broadcastMessage("ewfw");
				Bukkit.broadcastMessage("ewewfwregregrgkerok");
				Bukkit.broadcastMessage("nwefuhwepuf");
				Bukkit.broadcastMessage("489e4fe9w8");
				Bukkit.broadcastMessage("wefwefwpöi.-,");
				Bukkit.broadcastMessage(".öoo.iz");
				Bukkit.broadcastMessage("4984wef984");
				Bukkit.broadcastMessage("4wfe8984");
				Bukkit.broadcastMessage("1f77841ew86");
				Bukkit.broadcastMessage("1fewe4f8we4");
				Bukkit.broadcastMessage("<ewqfwrf");
				Bukkit.broadcastMessage("gehbnrmk,");
				Bukkit.broadcastMessage("rfwef");
				Bukkit.broadcastMessage("ewfw");
				Bukkit.broadcastMessage("ewewfwregregrgkerok");
				Bukkit.broadcastMessage("nwefuhwepuf");
				Bukkit.broadcastMessage("489e4fe9w8");
				Bukkit.broadcastMessage("wefwefwpöi.-,");
				Bukkit.broadcastMessage(".öoo.iz");
				Bukkit.broadcastMessage("4984wef984");
				Bukkit.broadcastMessage("4wfe8984");
				Bukkit.broadcastMessage("1f77841ew86");
				Bukkit.broadcastMessage("1fewe4f8we4");
				Bukkit.broadcastMessage("<ewqfwrf");
				Bukkit.broadcastMessage("gehbnrmk,");
				Bukkit.broadcastMessage("3r20ur80j0");
				Bukkit.broadcastMessage("wef23ri0ß0f");
				Bukkit.broadcastMessage("32r892hfß0i");
				Bukkit.broadcastMessage("3roj2390fdjweopk,");
				Bukkit.broadcastMessage("rfwef");
				Bukkit.broadcastMessage("ewfw");
				Bukkit.broadcastMessage("ewewfwregregrgkerok");
				Bukkit.broadcastMessage("nwefuhwepuf");
				Bukkit.broadcastMessage("489e4fe9w8");
				Bukkit.broadcastMessage("wefwefwpöi.-,");
				Bukkit.broadcastMessage(".öoo.iz");
				Bukkit.broadcastMessage("4984wef984");
				Bukkit.broadcastMessage("4wfe8984");
				Bukkit.broadcastMessage("1f77841ew86");
				Bukkit.broadcastMessage("1fewe4f8we4");
				Bukkit.broadcastMessage("<ewqfwrf");
				Bukkit.broadcastMessage("gehbnrmk,");
				Bukkit.broadcastMessage("3r20ur80j0");
				Bukkit.broadcastMessage("wef23ri0ß0f");
				Bukkit.broadcastMessage("32r892hfß0i");
				Bukkit.broadcastMessage("3roj2390fdjweopk,");
				Bukkit.broadcastMessage("rfwef");
				Bukkit.broadcastMessage("ewfw");
				Bukkit.broadcastMessage("ewewfwregregrgkerok");
				Bukkit.broadcastMessage("nwefuhwepuf");
				Bukkit.broadcastMessage("489e4fe9w8");
				Bukkit.broadcastMessage("wefwefwpöi.-,");
				Bukkit.broadcastMessage(".öoo.iz");
				Bukkit.broadcastMessage("4984wef984");
				Bukkit.broadcastMessage("4wfe8984");
				Bukkit.broadcastMessage("1f77841ew86");
				Bukkit.broadcastMessage("1fewe4f8we4");
				Bukkit.broadcastMessage("<ewqfwrf");
				Bukkit.broadcastMessage("gehbnrmk,");
				Bukkit.broadcastMessage("3r20ur80j0");
				Bukkit.broadcastMessage("wef23ri0ß0f");
				Bukkit.broadcastMessage("32r892hfß0i");
				Bukkit.broadcastMessage("3roj2390fdjweopk,");
				Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', fm_spam));
				p.playSound(p.getLocation(), Sound.ENTITY_BAT_LOOP, 1.0F, 1.0F);
				return true;
			}
		}

		if (cmd.getName().equalsIgnoreCase("fm-h10")) {
			String no_perm = getConfig().getString("Config.no_perm");
			String fm_h10 = getConfig().getString("Config.fm_h10");
			if (p != null)

				if (!(p.hasPermission("fm.h10"))) {
					p.sendMessage(ChatColor.translateAlternateColorCodes('&', no_perm));
				}

			if (p.hasPermission("fm.h10"))
				;
			{
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', fm_h10));
				p.setHealthScale(20);
				p.playSound(p.getLocation(), Sound.BLOCK_WOODEN_DOOR_OPEN, 1.0F, 1.0F);
				return true;
			}
		}

		if (cmd.getName().equalsIgnoreCase("fm-h15")) {
			String no_perm = getConfig().getString("Config.no_perm");
			String fm_h15 = getConfig().getString("Config.fm_h15");
			if (p != null)

				if (!(p.hasPermission("fm.h15"))) {
					p.sendMessage(ChatColor.translateAlternateColorCodes('&', no_perm));
				}

			if (p.hasPermission("fm.h15"))
				;
			{
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', fm_h15));
				p.setHealthScale(30);
				p.playSound(p.getLocation(), Sound.BLOCK_WOODEN_DOOR_OPEN, 1.0F, 1.0F);
				return true;
			}
		}

		if (cmd.getName().equalsIgnoreCase("fm-h20")) {
			String no_perm = getConfig().getString("Config.no_perm");
			String fm_h20 = getConfig().getString("Config.fm_h20");
			if (p != null)

				if (!(p.hasPermission("fm.h20"))) {
					p.sendMessage(ChatColor.translateAlternateColorCodes('&', no_perm));
				}

			if (p.hasPermission("fm.h20"))
				;
			{
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', fm_h20));
				p.setHealthScale(40);
				p.playSound(p.getLocation(), Sound.BLOCK_WOODEN_DOOR_OPEN, 1.0F, 1.0F);
				return true;
			}
		}

		if (cmd.getName().equalsIgnoreCase("fm-h30")) {
			String no_perm = getConfig().getString("Config.no_perm");
			String fm_h30 = getConfig().getString("Config.fm_h30");
			if (p != null)

				if (!(p.hasPermission("fm.h30"))) {
					p.sendMessage(ChatColor.translateAlternateColorCodes('&', no_perm));
				}

			if (p.hasPermission("fm.h30"))
				;
			{
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', fm_h30));
				p.setHealthScale(60);
				p.playSound(p.getLocation(), Sound.BLOCK_WOODEN_DOOR_OPEN, 1.0F, 1.0F);
				return true;
			}
		}

		if (cmd.getName().equalsIgnoreCase("fm-h40")) {
			String no_perm = getConfig().getString("Config.no_perm");
			String fm_h40 = getConfig().getString("Config.fm_h40");
			if (p != null)

				if (!(p.hasPermission("fm.h40"))) {
					p.sendMessage(ChatColor.translateAlternateColorCodes('&', no_perm));
				}

			if (p.hasPermission("fm.h40"))
				;
			{
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', fm_h40));
				p.setHealthScale(80);
				p.playSound(p.getLocation(), Sound.BLOCK_WOODEN_DOOR_OPEN, 1.0F, 1.0F);
				return true;
			}
		}

		if (cmd.getName().equalsIgnoreCase("fm-h50")) {
			String no_perm = getConfig().getString("Config.no_perm");
			String fm_h50 = getConfig().getString("Config.fm_h50");
			if (p != null)

				if (!(p.hasPermission("fm.h50"))) {
					p.sendMessage(ChatColor.translateAlternateColorCodes('&', no_perm));
				}

			if (p.hasPermission("fm.h50"))
				;
			{
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', fm_h50));
				p.setHealthScale(100);
				p.playSound(p.getLocation(), Sound.BLOCK_WOODEN_DOOR_OPEN, 1.0F, 1.0F);
				return true;
			}
		}

		if (cmd.getName().equalsIgnoreCase("fm-h60")) {
			String no_perm = getConfig().getString("Config.no_perm");
			String fm_h60 = getConfig().getString("Config.fm_h60");
			if (p != null)

				if (!(p.hasPermission("fm.h60"))) {
					p.sendMessage(ChatColor.translateAlternateColorCodes('&', no_perm));
				}

			if (p.hasPermission("fm.h60"))
				;
			{
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', fm_h60));
				p.setHealthScale(120);
				p.playSound(p.getLocation(), Sound.BLOCK_WOODEN_DOOR_OPEN, 1.0F, 1.0F);
				return true;
			}
		}

		if (cmd.getName().equalsIgnoreCase("fm-h70")) {
			String no_perm = getConfig().getString("Config.no_perm");
			String fm_h70 = getConfig().getString("Config.fm_h70");
			if (p != null)

				if (!(p.hasPermission("fm.h70"))) {
					p.sendMessage(ChatColor.translateAlternateColorCodes('&', no_perm));
				}

			if (p.hasPermission("fm.h70"))
				;
			{
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', fm_h70));
				p.setHealthScale(140);
				p.playSound(p.getLocation(), Sound.BLOCK_WOODEN_DOOR_OPEN, 1.0F, 1.0F);
				return true;
			}
		}

		if (cmd.getName().equalsIgnoreCase("fm-h80")) {
			String no_perm = getConfig().getString("Config.no_perm");
			String fm_h80 = getConfig().getString("Config.fm_h80");
			if (p != null)

				if (!(p.hasPermission("fm.h80"))) {
					p.sendMessage(ChatColor.translateAlternateColorCodes('&', no_perm));
				}

			if (p.hasPermission("fm.h80"))
				;
			{
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', fm_h80));
				p.setHealthScale(160);
				p.playSound(p.getLocation(), Sound.BLOCK_WOODEN_DOOR_OPEN, 1.0F, 1.0F);
				return true;
			}
		}

		if (cmd.getName().equalsIgnoreCase("fm-h90")) {
			String no_perm = getConfig().getString("Config.no_perm");
			String fm_h90 = getConfig().getString("Config.fm_h90");
			if (p != null)

				if (!(p.hasPermission("fm.h90"))) {
					p.sendMessage(ChatColor.translateAlternateColorCodes('&', no_perm));
				}

			if (p.hasPermission("fm.h90"))
				;
			{
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', fm_h90));
				p.setHealthScale(180);
				p.playSound(p.getLocation(), Sound.BLOCK_WOODEN_DOOR_OPEN, 1.0F, 1.0F);
				return true;
			}
		}

		if (cmd.getName().equalsIgnoreCase("fm-h100")) {
			String no_perm = getConfig().getString("Config.no_perm");
			String fm_h100 = getConfig().getString("Config.fm_h100");
			if (p != null)

				if (!(p.hasPermission("fm.h100"))) {
					p.sendMessage(ChatColor.translateAlternateColorCodes('&', no_perm));
				}

			if (p.hasPermission("fm.h100"))
				;
			{
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', fm_h100));
				p.setHealthScale(200);
				p.playSound(p.getLocation(), Sound.BLOCK_WOODEN_DOOR_OPEN, 1.0F, 1.0F);
				return true;
			}
		}

		if (cmd.getName().equalsIgnoreCase("fm-heal")) {
			String no_perm = getConfig().getString("Config.no_perm");
			String fm_heal = getConfig().getString("Config.fm_heal");
			if (p != null)

				if (!(p.hasPermission("fm.heal"))) {
					p.sendMessage(ChatColor.translateAlternateColorCodes('&', no_perm));
				}

			if (p.hasPermission("fm.heal"))
				;
			{
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', fm_heal));
				p.setHealth(20);
				p.setFoodLevel(20);
				p.removePotionEffect(PotionEffectType.ABSORPTION);
				p.removePotionEffect(PotionEffectType.BLINDNESS);
				p.removePotionEffect(PotionEffectType.CONFUSION);
				p.removePotionEffect(PotionEffectType.DAMAGE_RESISTANCE);
				p.removePotionEffect(PotionEffectType.FAST_DIGGING);
				p.removePotionEffect(PotionEffectType.FIRE_RESISTANCE);
				p.removePotionEffect(PotionEffectType.HARM);
				p.removePotionEffect(PotionEffectType.HEAL);
				p.removePotionEffect(PotionEffectType.HEALTH_BOOST);
				p.removePotionEffect(PotionEffectType.HUNGER);
				p.removePotionEffect(PotionEffectType.INCREASE_DAMAGE);
				p.removePotionEffect(PotionEffectType.INVISIBILITY);
				p.removePotionEffect(PotionEffectType.JUMP);
				p.removePotionEffect(PotionEffectType.REGENERATION);
				p.removePotionEffect(PotionEffectType.NIGHT_VISION);
				p.removePotionEffect(PotionEffectType.POISON);
				p.removePotionEffect(PotionEffectType.SATURATION);
				p.removePotionEffect(PotionEffectType.SLOW);
				p.removePotionEffect(PotionEffectType.SLOW_DIGGING);
				p.removePotionEffect(PotionEffectType.SPEED);
				p.removePotionEffect(PotionEffectType.WATER_BREATHING);
				p.removePotionEffect(PotionEffectType.WEAKNESS);
				p.removePotionEffect(PotionEffectType.WITHER);
				p.playSound(p.getLocation(), Sound.ENTITY_PLAYER_SMALL_FALL, 1.0F, 1.0F);
				return true;
			}
		}

		if (cmd.getName().equalsIgnoreCase("fm-pkill")) {
			String no_perm = getConfig().getString("Config.no_perm");
			String fm_pkill = getConfig().getString("Config.fm_pkill");
			if (p != null)

				if (!(p.hasPermission("fm.pkill"))) {
					p.sendMessage(ChatColor.translateAlternateColorCodes('&', no_perm));
				}

			if (p.hasPermission("fm.pkill"))
				;
			{
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', fm_pkill));
				p.setHealthScale(20);
				p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 3000, 250));
				p.playSound(p.getLocation(), Sound.ENTITY_PLAYER_BIG_FALL, 1.0F, 1.0F);
				return true;
			}
		}

		if (cmd.getName().equalsIgnoreCase("fm-uuid")) {
			String no_perm = getConfig().getString("Config.no_perm");
			String fm_uuid = getConfig().getString("Config.fm_uuid");
			if (p != null)

				if (!(p.hasPermission("fm.uuid"))) {
					p.sendMessage(ChatColor.translateAlternateColorCodes('&', no_perm));
				}
			if (p.hasPermission("fm.uuid")) {
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', fm_uuid) + p.getUniqueId());
				return true;
			}
		}

		if (cmd.getName().equalsIgnoreCase("fm-ip")) {
			String no_perm = getConfig().getString("Config.no_perm");
			String fm_ip = getConfig().getString("Config.fm_ip");
			if (p != null)

				if (!(p.hasPermission("fm.ip"))) {
					p.sendMessage(ChatColor.translateAlternateColorCodes('&', no_perm));
				}

			if (p.hasPermission("fm.ip"))
				;
			{
				p.sendMessage(ChatColor.translateAlternateColorCodes('&',
						fm_ip + p.getAddress().getAddress().getHostAddress()));
				return true;
			}
		}

		if (cmd.getName().equalsIgnoreCase("fm-fly-on")) {
			String no_perm = getConfig().getString("Config.no_perm");
			String fm_fly_on = getConfig().getString("Config.fm_fly_on");
			if (p != null)

				if (!(p.hasPermission("fm.fly.on"))) {
					p.sendMessage(ChatColor.translateAlternateColorCodes('&', no_perm));
				}

			if (p.hasPermission("fm.fly.on"))
				;
			{
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', fm_fly_on));
				p.setAllowFlight(true);
				return true;
			}
		}

		if (cmd.getName().equalsIgnoreCase("fm-fly-off")) {
			String no_perm = getConfig().getString("Config.no_perm");
			String fm_fly_off = getConfig().getString("Config.fm_fly_off");
			if (p != null)

				if (!(p.hasPermission("fm.fly.off"))) {
					p.sendMessage(ChatColor.translateAlternateColorCodes('&', no_perm));
				}

			if (p.hasPermission("fm.fly.off"))
				;
			{
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', fm_fly_off));
				p.setAllowFlight(false);
				return true;
			}
		}

		if (cmd.getName().equalsIgnoreCase("fm-jump-on")) {
			String no_perm = getConfig().getString("Config.no_perm");
			String fm_jump_on = getConfig().getString("Config.fm_jump_on");
			if (p != null)

				if (!(p.hasPermission("fm.jump.off"))) {
					p.sendMessage(ChatColor.translateAlternateColorCodes('&', no_perm));
				}

			if (p.hasPermission("fm.jump.on"))
				;
			{
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', fm_jump_on));
				p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 99999999, 15));
				return true;
			}
		}

		if (cmd.getName().equalsIgnoreCase("fm-jump-off")) {
			String no_perm = getConfig().getString("Config.no_perm");
			String fm_jump_off = getConfig().getString("Config.fm_jump_off");
			if (p != null)

				if (!(p.hasPermission("fm.jump.off"))) {
					p.sendMessage(ChatColor.translateAlternateColorCodes('&', no_perm));
				}
			if (p.hasPermission("fm.jump.off"))
				;
			{
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', fm_jump_off));
				p.removePotionEffect(PotionEffectType.JUMP);
				return true;
			}
		}

		if (cmd.getName().equalsIgnoreCase("fm-speed-on")) {
			String no_perm = getConfig().getString("Config.no_perm");
			String fm_speed_on = getConfig().getString("Config.fm_speed_on");
			if (p != null)

				if (!(p.hasPermission("fm.speed.on"))) {
					p.sendMessage(ChatColor.translateAlternateColorCodes('&', no_perm));
				}

			if (p.hasPermission("fm.speed.on"))
				;
			{
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', fm_speed_on));
				p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 9999999, 10));
				return true;
			}
		}

		if (cmd.getName().equalsIgnoreCase("fm-speed-off")) {
			String no_perm = getConfig().getString("Config.no_perm");
			String fm_speed_off = getConfig().getString("Config.fm_speed_off");
			if (p != null)

				if (!(p.hasPermission("fm.speed.off"))) {
					p.sendMessage(ChatColor.translateAlternateColorCodes('&', no_perm));
				}

			if (p.hasPermission("fm.speed.off"))
				;
			{
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', fm_speed_off));
				p.removePotionEffect(PotionEffectType.SPEED);
				return true;
			}
		}

		if (cmd.getName().equalsIgnoreCase("fm-gm-0")) {
			String no_perm = getConfig().getString("Config.no_perm");
			String fm_gm_0 = getConfig().getString("Config.fm_gm_0");
			if (p != null)

				if (!(p.hasPermission("fm.gm.0"))) {
					p.sendMessage(ChatColor.translateAlternateColorCodes('&', no_perm));
				}

			if (p.hasPermission("fm.gm.0"))
				;
			{
				p.setGameMode(GameMode.SURVIVAL);
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', fm_gm_0));
				return true;
			}
		}

		if (cmd.getName().equalsIgnoreCase("fm-gm-1")) {
			String no_perm = getConfig().getString("Config.no_perm");
			String fm_gm_1 = getConfig().getString("Config.fm_gm_1");
			if (p != null)

				if (!(p.hasPermission("fm.gm.1"))) {
					p.sendMessage(ChatColor.translateAlternateColorCodes('&', no_perm));
				}

			if (p.hasPermission("fm.gm.1"))
				;
			{
				p.setGameMode(GameMode.CREATIVE);
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', fm_gm_1));
				return true;
			}
		}

		if (cmd.getName().equalsIgnoreCase("fm-gm-2")) {
			String no_perm = getConfig().getString("Config.no_perm");
			String fm_gm_2 = getConfig().getString("Config.fm_gm_2");
			if (p != null)

				if (!(p.hasPermission("fm.gm.2"))) {
					p.sendMessage(ChatColor.translateAlternateColorCodes('&', no_perm));
				}

			if (p.hasPermission("fm.gm.2"))
				;
			{
				p.setGameMode(GameMode.ADVENTURE);
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', fm_gm_2));
				return true;
			}
		}

		if (cmd.getName().equalsIgnoreCase("fm-gm-3")) {
			String no_perm = getConfig().getString("Config.no_perm");
			String fm_gm_3 = getConfig().getString("Config.fm_gm_3");
			if (p != null)

				if (!(p.hasPermission("fm.gm.3"))) {
					p.sendMessage(ChatColor.translateAlternateColorCodes('&', no_perm));
				}

			if (p.hasPermission("fm.gm.3"))
				;
			{
				p.setGameMode(GameMode.SPECTATOR);
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', fm_gm_3));
				return true;
			}
		}

		if (cmd.getName().equalsIgnoreCase("fm-strengh-on")) {
			String no_perm = getConfig().getString("Config.no_perm");
			String fm_strengh_on = getConfig().getString("Config.fm_strengh_on");
			if (p != null)

				if (!(p.hasPermission("fm.strengh"))) {
					p.sendMessage(ChatColor.translateAlternateColorCodes('&', no_perm));
				}

			if (p.hasPermission("fm.strengh"))
				;
			{
				p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 9999999, 100));
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', fm_strengh_on));
			}
			return true;
		}

		if (cmd.getName().equalsIgnoreCase("fm-strengh-off")) {
			String no_perm = getConfig().getString("Config.no_perm");
			String fm_strengh_off = getConfig().getString("Config.fm_strengh_off");
			if (p != null)

				if (!(p.hasPermission("fm.strengh"))) {
					p.sendMessage(ChatColor.translateAlternateColorCodes('&', no_perm));
				}

			if (p.hasPermission("fm.strengh"))
				;
			{
				p.removePotionEffect(PotionEffectType.INCREASE_DAMAGE);
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', fm_strengh_off));
			}
			return true;
		}

		if (cmd.getName().equalsIgnoreCase("fm-invis-on")) {
			String no_perm = getConfig().getString("Config.no_perm");
			String fm_invis_on = getConfig().getString("Config.fm_invis_on");
			if (p != null)

				if (!(p.hasPermission("fm.invis"))) {
					p.sendMessage(ChatColor.translateAlternateColorCodes('&', no_perm));
				}

			if (p.hasPermission("fm.invis"))
				;
			{
				p.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 9999999, 255));
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', fm_invis_on));
			}
			return true;
		}

		if (cmd.getName().equalsIgnoreCase("fm-invis-off")) {
			String no_perm = getConfig().getString("Config.no_perm");
			String fm_invis_off = getConfig().getString("Config.fm_invis_off");
			if (p != null)

				if (!(p.hasPermission("fm.invis"))) {
					p.sendMessage(ChatColor.translateAlternateColorCodes('&', no_perm));
				}

			if (p.hasPermission("fm.invis"))
				;
			{
				p.removePotionEffect(PotionEffectType.INVISIBILITY);
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', fm_invis_off));
			}
			return true;
		}

		if (cmd.getName().equalsIgnoreCase("fm-server")) {
			String no_perm = getConfig().getString("Config.no_perm");
			String fm_server = getConfig().getString("Config.fm_server");
			String fm_server_1 = getConfig().getString("Config.fm_server_1");
			String fm_server_2 = getConfig().getString("Config.fm_server_2");
			String fm_server_3 = getConfig().getString("Config.fm_server_3");
			String fm_server_4 = getConfig().getString("Config.fm_server_4");
			fm_server_2 = fm_server_2.replace("[ServerNAME]", Bukkit.getServerName());
			fm_server_3 = fm_server_3.replace("[ServerVERSION]", Bukkit.getBukkitVersion());
			fm_server_4 = fm_server_4.replace("[ServerMOTD]", Bukkit.getMotd());
			if (p != null)

				if (!(p.hasPermission("fm.server"))) {
					p.sendMessage(ChatColor.translateAlternateColorCodes('&', no_perm));
				}

			if (p.hasPermission("fm.server"))
				;
			{
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', fm_server));
				p.sendMessage("");
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', fm_server_1)); // Line
																							// 1
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', fm_server_2)); // Line
																							// 2
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', fm_server_3)); // Line
																							// 3
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', fm_server_4)); // Line
																							// 4
				p.sendMessage("");
			}
			return true;
		}

		if (cmd.getName().equalsIgnoreCase("fm-hat")) {
			String no_perm = getConfig().getString("Config.no_perm");
			String fm_hat = getConfig().getString("Config.fm_hat");
			if (p != null)

				if (!(p.hasPermission("fm.hat"))) {
					p.sendMessage(ChatColor.translateAlternateColorCodes('&', no_perm));
				}

			if (p.hasPermission("fm.hat"))
				;
			{
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', fm_hat));
				p.getInventory().setHelmet(p.getItemInHand());
				p.setItemInHand(new ItemStack(Material.AIR));
			}
			return true;
		}

		if (cmd.getName().equalsIgnoreCase("fm-reload")) {
			String no_perm = getConfig().getString("Config.no_perm");
			String Reload_message = getConfig().getString("Config.Reload_message");
			final String RL_message = getConfig().getString("Config.Reload_message_0");
			if (p != null)

				if (!(p.hasPermission("fm.reload"))) {
					p.sendMessage(ChatColor.translateAlternateColorCodes('&', no_perm));
				}

			if (p.hasPermission("fm.reload"))
				;
			{
				Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', Reload_message));
				Bukkit.getScheduler().scheduleSyncDelayedTask(this, new Runnable() {

					public void run() {
						Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', RL_message));
						Bukkit.getServer().reload();

					}
				}, 100);
			}
			return true;
		}

		if (cmd.getName().equalsIgnoreCase("fm-reloadCFG")) {
			String no_perm = getConfig().getString("Config.no_perm");
			String CFG_Reload = getConfig().getString("Config.CFG_Reload");
			if (p != null)

				if (!(p.hasPermission("fm.reloadcfg"))) {
					p.sendMessage(ChatColor.translateAlternateColorCodes('&', no_perm));
				}

			if (p.hasPermission("fm.reloadcfg"))
				;
			{
				reloadConfig();
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', CFG_Reload));
			}
			return true;
		}

		if (cmd.getName().equalsIgnoreCase("fm-playerinfo")) {
			String no_perm = getConfig().getString("Config.no_perm");
			if (p != null) {

				if (!(p.hasPermission("fm.playerinfo"))) {
					p.sendMessage(ChatColor.translateAlternateColorCodes('&', no_perm));
				}

				if (p.hasPermission("fm.playerinfo")) {

					if (args.length != 1) {
						p.sendMessage("No Player given");
						return true;
					}

					Player pinfo = this.getServer().getPlayer(args[0]);

					try {
						p.sendMessage("§8---------- §c" + pinfo.getDisplayName() + " §8----------");
						p.sendMessage("§6IP §8>> §c" + pinfo.getAddress().getAddress().getHostAddress());
						p.sendMessage("§6IP Host §8>> §c" + pinfo.getAddress().getHostName());
						p.sendMessage("§6World §8>> §c" + pinfo.getWorld().getName());
						p.sendMessage("§6Location §8>> §7" + pinfo.getLocation().getBlockX() + " "
								+ pinfo.getLocation().getBlockY() + " " + pinfo.getLocation().getBlockZ());
					} catch (Exception e) {
						p.sendMessage("Player not Found");
					}

					return true;
				}
			}
		}

		if (cmd.getName().equalsIgnoreCase("fm-report")) {
			String no_perm = getConfig().getString("Config.no_perm");
			String no_player_given = getConfig().getString("Config.no_player_given");
			if (p != null) {

				if (!(p.hasPermission("fm.report"))) {
					p.sendMessage(ChatColor.translateAlternateColorCodes('&', no_perm));
				}

				if (p.hasPermission("fm.report")) {

					if (args.length != 1) {
						p.sendMessage(ChatColor.translateAlternateColorCodes('&', no_player_given));
						return false;
					}

					Player reportet = this.getServer().getPlayer(args[0]);

					String m_to_reporter = getConfig().getString("Config.m_to_reporter");
					m_to_reporter = m_to_reporter.replace("[REPORTET]", args[0]);
					m_to_reporter = m_to_reporter.replace("[REPORTER]", p.getDisplayName());
					String m_to_team = getConfig().getString("Config.m_to_team");
					m_to_team = m_to_team.replace("[REPORTER]", p.getDisplayName());
					m_to_team = m_to_team.replace("[REPORTET]", args[0]);

					try {
						Bukkit.broadcast(ChatColor.translateAlternateColorCodes('&', m_to_team), "fm.report.message");
						p.sendMessage(ChatColor.translateAlternateColorCodes('&', m_to_reporter));
						reportet.playSound(reportet.getLocation(), Sound.ENTITY_ENDERDRAGON_DEATH, 4.0F, 4.0F);
					} catch (Exception e) {
						p.sendMessage("§8[§4Report§7] §cPlayer §e" + args[0] + " §cis not online");
					}
				}

				return true;
			}
		}

		if (cmd.getName().equalsIgnoreCase("fm-items")) {
			String no_perm = getConfig().getString("Config.no_perm");
			String fm_items = getConfig().getString("Config.fm_items");
			String cookie_name = getConfig().getString("Config.cookie_name");
			String note_name = getConfig().getString("Config.note_name");
			String equip_name = getConfig().getString("Config.equip_name");
			String potions_name = getConfig().getString("Config.potions_name");
			String achievement_name = getConfig().getString("Config.achievement_name");
			if (p != null)

				if (!(p.hasPermission("fm.items"))) {
					p.sendMessage(ChatColor.translateAlternateColorCodes('&', no_perm));
				}

			if (p.hasPermission("fm.items"))
				;
			{
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', fm_items));

				ItemStack cookie = new ItemStack(Material.COOKIE);
				ItemMeta cookieM = cookie.getItemMeta();
				cookieM.setDisplayName(ChatColor.translateAlternateColorCodes('&', cookie_name));
				cookie.setItemMeta(cookieM);
				p.getInventory().addItem(cookie);

				ItemStack note = new ItemStack(Material.NOTE_BLOCK);
				ItemMeta noteM = note.getItemMeta();
				noteM.setDisplayName(ChatColor.translateAlternateColorCodes('&', note_name));
				note.setItemMeta(noteM);
				p.getInventory().addItem(note);

				ItemStack equip = new ItemStack(Material.RAW_FISH);
				ItemMeta equipM = equip.getItemMeta();
				equipM.setDisplayName(ChatColor.translateAlternateColorCodes('&', equip_name));
				equip.setItemMeta(equipM);
				p.getInventory().addItem(equip);

				ItemStack potions = new ItemStack(Material.FERMENTED_SPIDER_EYE);
				ItemMeta potionsM = potions.getItemMeta();
				potionsM.setDisplayName(ChatColor.translateAlternateColorCodes('&', potions_name));
				potions.setItemMeta(potionsM);
				p.getInventory().addItem(potions);

				ItemStack ach = new ItemStack(Material.BOOK);
				ItemMeta achM = ach.getItemMeta();
				achM.setDisplayName(ChatColor.translateAlternateColorCodes('&', achievement_name));
				ach.setItemMeta(achM);
				p.getInventory().addItem(ach);

			}
			return true;
		}

		if (cmd.getName().equalsIgnoreCase("fm-clearEC")) {
			String no_perm = getConfig().getString("Config.no_perm");
			String own_clear = getConfig().getString("Config.ec_clear_own");
			String other_clear = getConfig().getString("Config.ec_clear_other");
			String other_clear_m = getConfig().getString("Config.ec_clear_other_m");
			if (p != null) {

				if (!(p.hasPermission("fm.clearEC"))) {
					p.sendMessage(ChatColor.translateAlternateColorCodes('&', no_perm));
				}

				if (p.hasPermission("fm.clearEC")) {

					if (args.length != 1) {
						p.getEnderChest().clear();
						p.sendMessage(ChatColor.translateAlternateColorCodes('&', own_clear));
						return true;
					}

					Player player = this.getServer().getPlayer(args[0]);
					other_clear = other_clear.replace("[PLAYER]", args[0]);
					other_clear = other_clear.replace("[CUSER]", p.getName());
					other_clear_m = other_clear_m.replace("[PLAYER]", args[0]);
					other_clear_m = other_clear_m.replace("[CUSER]", p.getName());

					try {
						player.getEnderChest().clear();
						player.sendMessage(ChatColor.translateAlternateColorCodes('&', other_clear_m));
						p.sendMessage(ChatColor.translateAlternateColorCodes('&', other_clear));
					} catch (Exception e) {
						p.sendMessage("Player not Found (§c" + args[0] + "§r)");
					}

					return true;
				}
			}
		}

		if (cmd.getName().equalsIgnoreCase("fm-hero")) {
			String no_perm = getConfig().getString("Config.no_perm");
			String fm_hero = getConfig().getString("Config.fm_hero");
			String fm_hero_broadcast = getConfig().getString("Config.fm_hero_broadcast");
			fm_hero_broadcast = fm_hero_broadcast.replace("[PLAYER]", p.getDisplayName());

			ItemStack helm = new ItemStack(Material.GOLD_HELMET);
			ItemMeta helmM = helm.getItemMeta();
			helmM.setDisplayName("§6HERO §eHelmet");
			helm.setItemMeta(helmM);
			helm.addUnsafeEnchantment(Enchantment.DURABILITY, 9999);
			helm.addUnsafeEnchantment(Enchantment.OXYGEN, 9999);
			helm.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 9999);
			ItemStack chest = new ItemStack(Material.GOLD_CHESTPLATE);
			ItemMeta chestM = chest.getItemMeta();
			chestM.setDisplayName("§6HERO §eChestplate");
			chest.setItemMeta(chestM);
			chest.addUnsafeEnchantment(Enchantment.DURABILITY, 9999);
			chest.addUnsafeEnchantment(Enchantment.OXYGEN, 9999);
			chest.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 9999);
			ItemStack hose = new ItemStack(Material.GOLD_LEGGINGS);
			ItemMeta hoseM = hose.getItemMeta();
			hoseM.setDisplayName("§6HERO §eLeggings");
			hose.setItemMeta(hoseM);
			hose.addUnsafeEnchantment(Enchantment.DURABILITY, 9999);
			hose.addUnsafeEnchantment(Enchantment.OXYGEN, 9999);
			hose.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 9999);
			ItemStack boot = new ItemStack(Material.GOLD_BOOTS);
			ItemMeta bootM = boot.getItemMeta();
			bootM.setDisplayName("§6HERO §eBoots");
			boot.setItemMeta(bootM);
			boot.addUnsafeEnchantment(Enchantment.DURABILITY, 9999);
			boot.addUnsafeEnchantment(Enchantment.OXYGEN, 9999);
			boot.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 9999);
			ItemStack schwert = new ItemStack(Material.GOLD_SWORD);
			ItemMeta schwertM = schwert.getItemMeta();
			schwertM.setDisplayName("§6HERO §eSchwert");
			schwert.setItemMeta(schwertM);
			schwert.addUnsafeEnchantment(Enchantment.DURABILITY, 9999);
			schwert.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 9999);
			schwert.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 9999);
			if (p != null)

				if (!(p.hasPermission("fm.hero"))) {
					p.sendMessage(ChatColor.translateAlternateColorCodes('&', no_perm));
				}

			if (p.hasPermission("fm.hero"))
				;
			{
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', fm_hero));
				Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', fm_hero_broadcast));
				p.getInventory().setHelmet(helm);
				p.getInventory().setChestplate(chest);
				p.getInventory().setLeggings(hose);
				p.getInventory().setBoots(boot);
				p.getInventory().addItem(schwert);
				p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 99999, 255));
				p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 99999, 10));
				p.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 99999, 255));
			}
			return true;
		}

		if (cmd.getName().equalsIgnoreCase("fm-lagg")) {
			String no_perm = getConfig().getString("Config.no_perm");
			String fm_lagg = getConfig().getString("Config.fm_lagg");
			if (p != null)

				if (p.hasPermission("fm.lagg")) {
					p.sendMessage(ChatColor.translateAlternateColorCodes('&', fm_lagg));
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} else {
					p.sendMessage(ChatColor.translateAlternateColorCodes('&', no_perm));
				}
			return true;
		}

		if (cmd.getName().equalsIgnoreCase("fm-bc-1")) {
			String no_perm = getConfig().getString("Config.no_perm");
			String BroadCast = getConfig().getString("Config.bc_1");
			if (p != null)

				if (!(p.hasPermission("fm.bc"))) {
					p.sendMessage(ChatColor.translateAlternateColorCodes('&', no_perm));
				}

			if (p.hasPermission("fm.bc")) {
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', BroadCast));
			}
			return true;
		}

		if (cmd.getName().equalsIgnoreCase("fm-bc-2")) {
			String no_perm = getConfig().getString("Config.no_perm");
			String BroadCast = getConfig().getString("Config.bc_2");
			if (p != null)

				if (!(p.hasPermission("fm.bc"))) {
					p.sendMessage(ChatColor.translateAlternateColorCodes('&', no_perm));
				}

			if (p.hasPermission("fm.bc")) {
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', BroadCast));
			}
			return true;
		}

		if (cmd.getName().equalsIgnoreCase("fm-bc-3")) {
			String no_perm = getConfig().getString("Config.no_perm");
			String BroadCast = getConfig().getString("Config.bc_3");
			if (p != null)

				if (!(p.hasPermission("fm.bc"))) {
					p.sendMessage(ChatColor.translateAlternateColorCodes('&', no_perm));
				}

			if (p.hasPermission("fm.bc")) {
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', BroadCast));
			}
			return true;
		}

		if (cmd.getName().equalsIgnoreCase("fm-noob")) {
			String no_perm = getConfig().getString("Config.no_perm");
			String Noob = getConfig().getString("Config.noob");
			if (p != null)

				if (!(p.hasPermission("fm.noob"))) {
					p.sendMessage(ChatColor.translateAlternateColorCodes('&', no_perm));
				}

			if (p.hasPermission("fm.noob")) {

				Player p2 = this.getServer().getPlayer(args[0]);
				Noob = Noob.replace("[PLAYER]", p2.getName());

				try {

					p2.setPlayerListName(ChatColor.translateAlternateColorCodes('&', Noob));

				} catch (Exception e) {
					p.sendMessage("Player not Found (§c" + args[0] + "§r)");
				}
			}
			return true;
		}

		if (cmd.getName().equalsIgnoreCase("fm-noob-off")) {
			String no_perm = getConfig().getString("Config.no_perm");
			String Noob = getConfig().getString("Config.noob");
			if (p != null)

				if (!(p.hasPermission("fm.noob"))) {
					p.sendMessage(ChatColor.translateAlternateColorCodes('&', no_perm));
				}

			if (p.hasPermission("fm.noob")) {

				Player p2 = this.getServer().getPlayer(args[0]);
				Noob = Noob.replace("[PLAYER]", p2.getName());

				try {

					p2.setPlayerListName(p2.getName());

				} catch (Exception e) {
					p.sendMessage("Player not Found (§c" + args[0] + "§r)");
				}
			}
			return true;
		}

		if (cmd.getName().equalsIgnoreCase("fm-fan")) {
			String no_perm = getConfig().getString("Config.no_perm");
			String BroadCast = getConfig().getString("Config.fan");
			BroadCast = BroadCast.replace("[PLAYER]", p.getDisplayName());
			if (p != null)

				if (!(p.hasPermission("fm.fan"))) {
					p.sendMessage(ChatColor.translateAlternateColorCodes('&', no_perm));
				}

			if (p.hasPermission("fm.fan")) {
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', BroadCast));
			}
			return true;
		}

		if (cmd.getName().equalsIgnoreCase("fm-troll")) {
			String no_perm = getConfig().getString("Config.no_perm");
			if (p != null) {

				if (!(p.hasPermission("fm.troll"))) {
					p.sendMessage(ChatColor.translateAlternateColorCodes('&', no_perm));
				}

				if (p.hasPermission("fm.troll")) {

					if (args.length != 1) {
						p.playSound(p.getLocation(), Sound.AMBIENT_CAVE, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.WEATHER_RAIN, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_LIGHTNING_THUNDER, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_BREAK, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_LAND, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_USE, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_ARROW_HIT, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_BAT_DEATH, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_BAT_HURT, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_BAT_AMBIENT, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_BAT_LOOP, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_BAT_TAKEOFF, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_BLAZE_AMBIENT, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_BLAZE_DEATH, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_BLAZE_HURT, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_PLAYER_BURP, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_CAT_HISS, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENCHANT_THORNS_HIT, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_CAT_PURREOW, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_CAT_PURR, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_CAT_PURREOW, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.BLOCK_CHEST_CLOSE, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.BLOCK_CHEST_OPEN, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_CHICKEN_EGG, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_CHICKEN_HURT, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_CHICKEN_AMBIENT, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_CHICKEN_STEP, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.BLOCK_LEVER_CLICK, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_COW_HURT, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_COW_AMBIENT, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_COW_STEP, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.BLOCK_GRASS_BREAK, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.BLOCK_GRAVEL_BREAK, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.BLOCK_SAND_BREAK, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.BLOCK_SNOW_BREAK, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.BLOCK_STONE_BREAK, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.BLOCK_WOOD_BREAK, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_DONKEY_ANGRY, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_DONKEY_DEATH, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_DONKEY_HURT, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_DONKEY_AMBIENT, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.BLOCK_WOODEN_DOOR_CLOSE, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.BLOCK_WOODEN_DOOR_OPEN, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_GENERIC_DRINK, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_PLAYER_BURP, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_ENDERDRAGON_DEATH, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_ENDERDRAGON_GROWL, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_ENDERDRAGON_HURT, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_ENDERDRAGON_FLAP, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_ENDERMEN_AMBIENT, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_GENERIC_EXPLODE, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_PLAYER_BIG_FALL, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_PLAYER_SMALL_FALL, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.BLOCK_FIRE_AMBIENT, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.BLOCK_FIRE_AMBIENT, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_FIREWORK_BLAST, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_FIREWORK_LARGE_BLAST, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_FIREWORK_LAUNCH, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_FIREWORK_TWINKLE, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_FIREWORK_TWINKLE_FAR, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_GHAST_AMBIENT, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_GHAST_DEATH, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_GHAST_SHOOT, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_GHAST_SCREAM, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_GHAST_WARN, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_GHAST_SCREAM, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.BLOCK_GLASS_BREAK, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_HORSE_ANGRY, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_HORSE_ARMOR, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_HORSE_BREATHE, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_HORSE_DEATH, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_HORSE_GALLOP, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_HORSE_HURT, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_HORSE_AMBIENT, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_HORSE_JUMP, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_HORSE_LAND, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_HORSE_SADDLE, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_SKELETON_HORSE_AMBIENT, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_SKELETON_HORSE_DEATH, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_SKELETON_HORSE_HURT, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_GUARDIAN_HURT_LAND, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_IRONGOLEM_DEATH, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_IRONGOLEM_ATTACK, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_IRONGOLEM_STEP, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_IRONGOLEM_DEATH, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_ITEM_BREAK, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_ITEM_PICKUP, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.BLOCK_LAVA_AMBIENT, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.BLOCK_LAVA_POP, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_MAGMACUBE_JUMP, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_MAGMACUBE_DEATH, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_MAGMACUBE_HURT, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_MINECART_INSIDE, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_MINECART_RIDING, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.BLOCK_NOTE_BASS, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.BLOCK_NOTE_BASEDRUM, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.BLOCK_NOTE_HARP, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.BLOCK_NOTE_HAT, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.BLOCK_NOTE_PLING, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.BLOCK_NOTE_SNARE, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_PIG_DEATH, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_PIG_STEP, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_PIG_HURT, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.BLOCK_PISTON_EXTEND, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.BLOCK_PISTON_CONTRACT, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.BLOCK_PORTAL_AMBIENT, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.BLOCK_PORTAL_TRAVEL, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_SHEEP_AMBIENT, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_SHEEP_SHEAR, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_SHEEP_STEP, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_ARROW_SHOOT, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_SILVERFISH_HURT, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_SILVERFISH_AMBIENT, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_SILVERFISH_DEATH, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_SILVERFISH_STEP, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_SKELETON_DEATH, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_SKELETON_HURT, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_SKELETON_AMBIENT, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_SKELETON_STEP, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_DEATH, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_TRADING, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_HURT, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_AMBIENT, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_YES, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.BLOCK_WATER_AMBIENT, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_WITHER_DEATH, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_WITHER_HURT, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_WITHER_AMBIENT, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_WITHER_SHOOT, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_WITHER_SPAWN, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_WOLF_WHINE, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_WOLF_DEATH, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_WOLF_GROWL, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_WOLF_HOWL, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_WOLF_HURT, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_WOLF_PANT, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_WOLF_SHAKE, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_WOLF_STEP, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_WOLF_WHINE, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.BLOCK_WOOD_BUTTON_CLICK_OFF, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_ZOMBIE_DEATH, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_ZOMBIE_HURT, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_ZOMBIE_AMBIENT, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_ZOMBIE_INFECT, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_ZOMBIE_INFECT, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_ZOMBIE_PIG_ANGRY, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_ZOMBIE_PIG_DEATH, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_ZOMBIE_PIG_HURT, 1.0F, 1.0F);
						p.playSound(p.getLocation(), Sound.ENTITY_ZOMBIE_PIG_AMBIENT, 1.0F, 1.0F);
						return true;
					}

					Player player = this.getServer().getPlayer(args[0]);

					try {
						player.playSound(p.getLocation(), Sound.AMBIENT_CAVE, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.WEATHER_RAIN, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_LIGHTNING_THUNDER, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.BLOCK_ANVIL_BREAK, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.BLOCK_ANVIL_LAND, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.BLOCK_ANVIL_USE, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_ARROW_HIT, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_BAT_DEATH, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_BAT_HURT, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_BAT_AMBIENT, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_BAT_LOOP, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_BAT_TAKEOFF, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_BLAZE_AMBIENT, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_BLAZE_DEATH, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_BLAZE_HURT, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_PLAYER_BURP, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_CAT_HISS, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENCHANT_THORNS_HIT, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_CAT_PURREOW, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_CAT_PURR, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_CAT_PURREOW, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.BLOCK_CHEST_CLOSE, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.BLOCK_CHEST_OPEN, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_CHICKEN_EGG, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_CHICKEN_HURT, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_CHICKEN_AMBIENT, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_CHICKEN_STEP, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.BLOCK_LEVER_CLICK, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_COW_HURT, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_COW_AMBIENT, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_COW_STEP, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.BLOCK_GRASS_BREAK, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.BLOCK_GRAVEL_BREAK, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.BLOCK_SAND_BREAK, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.BLOCK_SNOW_BREAK, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.BLOCK_STONE_BREAK, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.BLOCK_WOOD_BREAK, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_DONKEY_ANGRY, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_DONKEY_DEATH, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_DONKEY_HURT, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_DONKEY_AMBIENT, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.BLOCK_WOODEN_DOOR_CLOSE, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.BLOCK_WOODEN_DOOR_OPEN, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_GENERIC_DRINK, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_PLAYER_BURP, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_ENDERDRAGON_DEATH, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_ENDERDRAGON_GROWL, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_ENDERDRAGON_HURT, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_ENDERDRAGON_FLAP, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_ENDERMEN_AMBIENT, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_GENERIC_EXPLODE, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_PLAYER_BIG_FALL, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_PLAYER_SMALL_FALL, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.BLOCK_FIRE_AMBIENT, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.BLOCK_FIRE_AMBIENT, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_FIREWORK_BLAST, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_FIREWORK_LARGE_BLAST, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_FIREWORK_LAUNCH, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_FIREWORK_TWINKLE, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_FIREWORK_TWINKLE_FAR, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_GHAST_AMBIENT, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_GHAST_DEATH, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_GHAST_SHOOT, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_GHAST_SCREAM, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_GHAST_WARN, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_GHAST_SCREAM, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.BLOCK_GLASS_BREAK, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_HORSE_ANGRY, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_HORSE_ARMOR, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_HORSE_BREATHE, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_HORSE_DEATH, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_HORSE_GALLOP, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_HORSE_HURT, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_HORSE_AMBIENT, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_HORSE_JUMP, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_HORSE_LAND, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_HORSE_SADDLE, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_SKELETON_HORSE_AMBIENT, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_SKELETON_HORSE_DEATH, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_SKELETON_HORSE_HURT, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_GUARDIAN_HURT_LAND, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_IRONGOLEM_DEATH, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_IRONGOLEM_ATTACK, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_IRONGOLEM_STEP, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_IRONGOLEM_DEATH, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_ITEM_BREAK, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_ITEM_PICKUP, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.BLOCK_LAVA_AMBIENT, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.BLOCK_LAVA_POP, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_MAGMACUBE_JUMP, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_MAGMACUBE_DEATH, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_MAGMACUBE_HURT, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_MINECART_INSIDE, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_MINECART_RIDING, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.BLOCK_NOTE_BASS, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.BLOCK_NOTE_BASEDRUM, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.BLOCK_NOTE_HARP, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.BLOCK_NOTE_HAT, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.BLOCK_NOTE_PLING, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.BLOCK_NOTE_SNARE, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_PIG_DEATH, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_PIG_STEP, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_PIG_HURT, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.BLOCK_PISTON_EXTEND, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.BLOCK_PISTON_CONTRACT, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.BLOCK_PORTAL_AMBIENT, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.BLOCK_PORTAL_TRAVEL, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_SHEEP_AMBIENT, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_SHEEP_SHEAR, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_SHEEP_STEP, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_ARROW_SHOOT, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_SILVERFISH_HURT, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_SILVERFISH_AMBIENT, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_SILVERFISH_DEATH, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_SILVERFISH_STEP, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_SKELETON_DEATH, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_SKELETON_HURT, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_SKELETON_AMBIENT, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_SKELETON_STEP, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_DEATH, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_TRADING, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_HURT, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_AMBIENT, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_YES, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.BLOCK_WATER_AMBIENT, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_WITHER_DEATH, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_WITHER_HURT, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_WITHER_AMBIENT, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_WITHER_SHOOT, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_WITHER_SPAWN, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_WOLF_WHINE, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_WOLF_DEATH, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_WOLF_GROWL, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_WOLF_HOWL, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_WOLF_HURT, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_WOLF_PANT, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_WOLF_SHAKE, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_WOLF_STEP, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_WOLF_WHINE, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.BLOCK_WOOD_BUTTON_CLICK_OFF, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_ZOMBIE_DEATH, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_ZOMBIE_HURT, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_ZOMBIE_AMBIENT, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_ZOMBIE_INFECT, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_ZOMBIE_INFECT, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_ZOMBIE_PIG_ANGRY, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_ZOMBIE_PIG_DEATH, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_ZOMBIE_PIG_HURT, 1.0F, 1.0F);
						player.playSound(p.getLocation(), Sound.ENTITY_ZOMBIE_PIG_AMBIENT, 1.0F, 1.0F);
					} catch (Exception e) {
						p.sendMessage("Player not Found (§c" + args[0] + "§r)");
					}

					return true;
				}
			}
		}

		if (cmd.getName().equalsIgnoreCase("fm-support")) {
			String fm_support = getConfig().getString("Config.fm_support");
			if (p != null) {
				p.sendMessage("");
				p.sendMessage("§a=========§3FunMessages §9Support§a=========");
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', fm_support));
				p.sendMessage("§a=========§3FunMessages §9Support§a=========");
				p.sendMessage("");
				p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_YES, 1.0F, 1.0F);
				return true;
			}
			sender.sendMessage("§4Only players are allowed to do this.");
			return true;
		}

		if (cmd.getName().equalsIgnoreCase("checknames")) {
			String no_perm = getConfig().getString("Config.no_perm");
			String NameList = getConfig().getString("Config.names");
			NameList = NameList.replace("[PLAYER]", p.getDisplayName());
			NameList = NameList.replace("[LINK]", "https://namemc.com/" + p.getUniqueId());
			if (p != null)

				if (p.hasPermission("fm.names")) {
					p.sendMessage(ChatColor.translateAlternateColorCodes('&', NameList));
				} else {
					p.sendMessage(ChatColor.translateAlternateColorCodes('&', no_perm));
				}
			return true;
		}

		return false;
	}

}
