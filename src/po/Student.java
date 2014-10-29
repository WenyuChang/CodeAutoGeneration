package po;
/**
*   @classAnnotation
*   name = "student"
*   package = "com.neulion.iptv.content"
*/
public class Student 
{
	/**
	 * @FieldAnnotation.ID
	 * type = "int"
	 */
	private int id;
	/**
	 * @FieldAnnotation
	 * type = "varchar(20)"
	 */
	private String name;
	/**
	 * @FieldAnnotation
	 * type = "int"
	 */
	private int age;
	/**
	 * @FieldAnnotation
	 * type = "int"
	 */
	private int score;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
}
