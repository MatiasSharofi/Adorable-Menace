public class aiCard {
	
	private int health;
	private int attack;
	private int coinsDropped;
	private String name;
	private int tier;
	
	public aiCard (int health2, int attack2, int coinsDropped2, String name2, int tier2)
	{
		health = health2;
		attack = attack2;
		coinsDropped = coinsDropped2;
		name = name2;
		tier = tier2;
	}
	public int getHealth()
	{
		return health;
	}
	public void setHealth(int health3)
	{
		this.health = health3;
	}
	public int getAttack()
	{
		return attack;
	}
	public void setAttack(int attack3)
	{
		this.attack = attack3;
	}
	public int getCoinsDropped()
	{
		return coinsDropped;
	}
	public void setCoinsDropped(int coinsDropped3)
	{
		this.coinsDropped = coinsDropped3;
	}
	public String getName()
	{
		return name;
	}
	public void setName (String name3)
	{
		this.name = name3;
	}
	public int getTier()
	{
		return tier;
	}
	public void setTier (int tier3)
	{
		this.tier = tier3;
	}
}
