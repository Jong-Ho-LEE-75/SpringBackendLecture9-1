package example15;

import java.util.List;

// 인터페이스로 계약 정의
public interface MenuService {
    // 구현체가 반드시 제공해야 하는 메서드
    List<String> getMenuList();
}
