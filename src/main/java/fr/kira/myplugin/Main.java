package fr.kira.myplugin;

import fr.kira.myplugin.Commands.Mp;
import fr.kira.myplugin.Commands.R;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        getCommand("msg").setExecutor(new Mp());
        getCommand("r").setExecutor(new R());
    }
}
