package demo_git_repo.demo_git_repo;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	private String name;
    private int age;
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
}
