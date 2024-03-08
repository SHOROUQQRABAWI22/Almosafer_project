package Almosafer;

import java.time.LocalDate;
import java.util.Random;

import org.testng.asserts.SoftAssert;

public class Parametres {
	String[] language = { "https://www.almosafer.com/en", "https://www.almosafer.com/ar" };
	Random rand = new Random();
	int randomNumber = rand.nextInt(2);

	static String[] enLanguage = { "Dubai", "Jeddah", "Riyadh" };
	static String[] arLanguage = { "جدة", "دبي" };
	  int enenLanguageRandom = rand.nextInt(3);
	  int arLanguageRandom = rand.nextInt(2);
	static LocalDate today = LocalDate.now();
	static int today_date = today.getDayOfMonth();

	SoftAssert asser = new SoftAssert();
	static int expectdFligh = today_date + 1;
	static int expectdReturn = today_date + 2;
	static int LowestPrice = 0;
	static int HighestPrice = 0;
}
