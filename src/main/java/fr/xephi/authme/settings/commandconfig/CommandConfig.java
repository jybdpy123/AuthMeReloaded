package fr.xephi.authme.settings.commandconfig;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Command configuration.
 *
 * @see CommandManager
 */
public class CommandConfig {

    private Map<String, Command> onJoin = new LinkedHashMap<>();
    private Map<String, Command> onLogin = new LinkedHashMap<>();
    private Map<String, Command> onRegister = new LinkedHashMap<>();

    public Map<String, Command> getOnJoin() {
        return onJoin;
    }

    public void setOnJoin(Map<String, Command> onJoin) {
        this.onJoin = onJoin;
    }

    public Map<String, Command> getOnLogin() {
        return onLogin;
    }

    public void setOnLogin(Map<String, Command> onLogin) {
        this.onLogin = onLogin;
    }

    public Map<String, Command> getOnRegister() {
        return onRegister;
    }

    public void setOnRegister(Map<String, Command> onRegister) {
        this.onRegister = onRegister;
    }
}
