package main;

import java.io.IOException;

public class MainMethod {
	public static void main(String[] args) throws IOException {
		if(args.length<3){
			System.out.println("��лʹ��");
			System.out.println("��ʹ������������");
			System.out.println("��ʽ�磺java -jar BitWebClient.jar <login|logout> <username> <password>");
			System.out.println("GitHub��ַ��https://github.com/yAnXImIN/BitWebClient");
			return;
		}
		String method = args[0];
		String username = args[1];
		String password = args[2];
		BitWebController b = new BitWebController();
		String result = null;
		if(method.equals("login")){
			result = b.doLogin(username, password);
		}
		if(method.equals("logout")){
			result = b.doLogout(username, password);
		}
		System.out.println(result);
	}
}
