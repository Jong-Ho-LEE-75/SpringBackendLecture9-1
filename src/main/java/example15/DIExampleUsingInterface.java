package example15;

public class DIExampleUsingInterface {
    public static void main(String[] args) {
        // 실제 운영 환경
        MenuService realService = new MenuServiceImpl();
        MenuController controller = new MenuController(realService);
        controller.printMenu();

        // 테스트 또는 Stub 사용 환경
        MenuService stubService = new MenuServiceStub();
        MenuController testController = new MenuController(stubService);
        testController.printMenu();
    }
}