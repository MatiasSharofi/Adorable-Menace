public class userCard {
	
	private int health;
	private int attack;
	private int coinsDropped;
	private String name;
	private int tier;
	
	public userCard (int health, int attack, int coinsDropped, String name, int tier)
	{
		this.health = health;
		this.attack = attack;
		this.coinsDropped = coinsDropped;
		this.name = name;
		this.tier = tier;
	}
	public int getHealth()
	{
		return health;
	}
	public void setHealth(int health1)
	{
		this.health = health1;
	}
	public int getAttack()
	{
		return attack;
	}
	public void setAttack(int attack1)
	{
		this.attack = attack1;
	}
	public int getCoinsDropped()
	{
		return coinsDropped;
	}
	public void setCoinsDropped(int coinsDropped1)
	{
		this.coinsDropped = coinsDropped1;
	}
	public String getName()
	{
		return name;
	}
	public void setName (String name1)
	{
		this.name = name1;
	}
	public int getTier()
	{
		return tier;
	}
	public void setTier (int tier1)
	{
		this.tier = tier1;
	}
}
