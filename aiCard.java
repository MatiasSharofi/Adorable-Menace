public class aiCard {
	
	private int health;
	private int attack;
	private int coinsDropped;
	private String name;
	
	public aiCard (int health2, int attack2, int coinsDropped2, String name2)
	{
		health = health2;
		attack = attack2;
		coinsDropped = coinsDropped2;
		name = name2;
	}
	public int getHealth()
	{
		return health;
	}
	public void setHealth(int health1)
	{
		health = health1;
	}
	public int getAttack()
	{
		return attack;
	}
	public void setAttack(int attack1)
	{
		attack = attack1;
	}
	public int getCoinsDropped()
	{
		return coinsDropped;
	}
	public void setCoinsDropped(int coinsDropped2)
	{
		coinsDropped = coinsDropped2;
	}
	public String getName()
	{
		return name;
	}
}
