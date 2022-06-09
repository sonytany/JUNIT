package sony.tany.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class controller
{
	@RestController
	public static class TestController
	{
		/**
		 * 1.통싱 메서드를 설정해 주지않으면 어떤것으로 호출해도
		 * 다 test로 연결된다.
		 * @return 문자열
		 */
		@RequestMapping(value = "/testAll")
		public String testAll()
		{
			return "TEST!!";
		}

		@GetMapping(value = "/testGet")
		public String getName()
		{
			return "TEST!!";
		}

	}
}
