public class aiCard {
	private int health;
	private int attack;
	
	public aiCard (int health, int attack)
	{
		this.health = health;
		this.attack = attack;
	}
	public int getHealth()
	{
		return health;
	}
	public void setHealth(int aiHealth)
	{
		health = aiHealth;
	}
	public int getAttack()
	{
		return attack;
	}
}
