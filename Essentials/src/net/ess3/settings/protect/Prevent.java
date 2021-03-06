package net.ess3.settings.protect;

import java.util.HashSet;
import java.util.Set;
import lombok.Data;
import lombok.EqualsAndHashCode;
import net.ess3.storage.*;
import org.bukkit.Material;


@Data
@EqualsAndHashCode(callSuper = false)
public class Prevent implements StorageObject
{
	@Comment("Which blocks should a piston not be able to push?")
	@ListType(Material.class)
	private Set<Material> pistonPush = new HashSet<Material>();
	private boolean lavaFlow = false;
	private boolean waterFlow = false;
	// private boolean waterbucketFlow = false; TODO: Test if this still works
	private boolean firespread = true;
	private boolean lavaFirespread = true;
	private boolean lightningFirespread = true;
	private boolean portalCreation = false;
	private boolean tntExplosion = false;
	private boolean fireballExplosion = false;
	private boolean fireballFire = false;
	private boolean creeperExplosion = false;
	private boolean creeperBlockdamage = false;
	private boolean enderdragonBlockdamage = false;
	private boolean endermanPickup = false;
	private boolean villagerDeath = false;
	@Comment(
	{
		"Monsters won't follow players",
		"permission essentials.protect.entitytarget.bypass disables this"
	})
	private boolean entitytarget = false;

	public Prevent()
	{
		pistonPush.add(Material.GLASS);
	}
}