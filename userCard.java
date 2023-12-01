public class userCard {
	private int health;
	private int attack;
	
	public userCard (int health, int attack)
	{
		this.health = health;
		this.attack = attack;
	}
	public int getHealth()
	{
		return health;
	}
	public void setHealth(int userHealth)
	{
		health = userHealth;
	}
	public int getAttack()
	{
		return attack;
	}
}
