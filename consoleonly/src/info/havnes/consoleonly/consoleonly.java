package info.havnes.consoleonly;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class consoleonly extends JavaPlugin implements Listener {

		public void onEnable() {
			Bukkit.getServer().getPluginManager().registerEvents(this, this);
		}
		

		public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args, PlayerCommandPreprocessEvent p ) {
			
			
			if(cmd.getName().equalsIgnoreCase("/test")) 
			{
				if(args.length == 0) 
				{
					sender.sendMessage("Test deop uten argumnent");
					return true;
				}
				
				Player target = Bukkit.getServer().getPlayer(args[0]);
				if(target == null) 
				{
					sender.sendMessage("Kunne ikke finne spiller " + args[0] + " !");
					return true;
				}
				if(args[0] == "notawake") {
				p.setCancelled(true);
				sender.sendMessage(ChatColor.RED + "Ingen tilgang! kontakt admin!");
				return true;
				}
			}
			return true;
		}
}
			
			// Forhindre bruk av lyn
//			if(cmd.getName().contains("lightning")) 
//			{
//				p.setCancelled(true);
//				p.getPlayer().sendMessage(ChatColor.RED + "Ingen tilgang! kontakt admin!");
//				
//			}
//			
//			if(cmd.getName().equalsIgnoreCase("kittycannon")) 
//			{
//				p.setCancelled(true);
//				sender.sendMessage(ChatColor.RED + "Ingen tilgang! kontakt admin!");
//			}
//				
//			if(cmd.getName().equalsIgnoreCase("deop")) 
//			{
//				if(args.length == 0)
//				{
//					sender.sendMessage(ChatColor.RED + "Tester uten argument");
//					
//				}
//				if(!p.getPlayer().hasPermission("con.deop.default"));
//				p.getPlayer().sendMessage("Du tar deg vann over hodet");
//				p.setCancelled(true);
//				p.getPlayer().sendMessage(ChatColor.RED + "Ikke prøv på noe du ikke kan gjøre!");
//				p.getPlayer().setOp(false);
//				//p.getPlayer().kickPlayer("Ikke gjør dette!! Igjen");
//				
//				
//			}
//			
//			if(cmd.getName().equalsIgnoreCase("/deop notawake")) 
//			{
//				if(p.getPlayer().hasPermission("con.deop.notawake"));
//				p.getPlayer().sendMessage("Du tar deg vann over hodet");
//				p.setCancelled(true);
//				p.getPlayer().sendMessage(ChatColor.RED + "Det er bare notawake som kan bruke den kommandoen :P");
//				//e.getPlayer().kickPlayer("Ikke gjør dette!!");
//				
//				
//			}
//			
//			if(cmd.getName().equalsIgnoreCase("/deop lassehavnes")) 
//			{
//				if(p.getPlayer().hasPermission("con.deop.lasse.teodor"));
//				p.getPlayer().sendMessage("Du tar deg vann over hodet");
//				p.setCancelled(true);
//				p.getPlayer().sendMessage(ChatColor.RED + "Det er bare notawake som kan bruke den kommandoen :P");
//				p.getPlayer().kickPlayer("TEODOR!!!!! Ikke gjør dette har jeg sagt :D hilsen meg, ja, onkel ja!!");
//			}
				
			
		
			
//		@EventHandler
//		public void onPlayerCommand(PlayerCommandPreprocessEvent e) {
//			String msg2 = e.getMessage().toLowerCase();
//			if(msg2.equalsIgnoreCase("/powertool")) {
//				
//				if(!e.getPlayer().hasPermission("con.powertool"));
//				e.getPlayer().sendMessage("Du må ha tillatelse til dette!");
//				e.setCancelled(true);
//				e.getPlayer().sendMessage(ChatColor.RED + "Det er bare notawake som kan bruke den kommandoen :P");
//				
//			}
//		
//			if(msg2.equalsIgnoreCase("/deop")) {
//				
//				
//				if(!e.getPlayer().hasPermission("con.deop.default"));
//				
//				e.getPlayer().sendMessage("Du tar deg vann over hodet");
//				e.setCancelled(true);
//				e.getPlayer().sendMessage(ChatColor.RED + "Ikke prøv på noe du ikke kan gjøre!");
//				
//				e.getPlayer().kickPlayer("Ikke gjør dette!! Igjen");
//				
//								
//			}
//			
//			if(msg2.equalsIgnoreCase("/deop notawake")) {
//				if(e.getPlayer().hasPermission("con.deop.notawake"));
//				e.getPlayer().sendMessage("Du tar deg vann over hodet");
//				e.setCancelled(true);
//				e.getPlayer().sendMessage(ChatColor.RED + "Det er bare notawake som kan bruke den kommandoen :P");
//				//e.getPlayer().kickPlayer("Ikke gjør dette!!");
//				
//			}
//			if(msg2.equalsIgnoreCase("/deop lassehavnes")) {
//				if(e.getPlayer().hasPermission("con.deop.lasse.teodor"));
//				e.getPlayer().sendMessage("Du tar deg vann over hodet");
//				e.setCancelled(true);
//				e.getPlayer().sendMessage(ChatColor.RED + "Det er bare notawake som kan bruke den kommandoen :P");
//				//e.getPlayer().kickPlayer("TEODOR!!!!! Ikke gjør dette har jeg sagt :D hilsen meg, ja, onkel ja!!");
//				
//			}
//			
		
		
		

