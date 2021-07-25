module me.clip.placeholderapi {
  requires com.google.gson;
  requires transitive org.bukkit;
  requires static org.jetbrains.annotations;
  exports me.clip.placeholderapi;
  exports me.clip.placeholderapi.events;
  exports me.clip.placeholderapi.expansion;
  exports me.clip.placeholderapi.expansion.manager to org.bukkit;
  opens me.clip.placeholderapi.expansion.cloud to com.google.gson;
}
