package example06;

//User 상속한 BusinessUser 클래스 생성
class BusinessUser extends User {
    private String email;
    //필드 추가
    private String companyName;

    public BusinessUser(String id, String name, String email, String companyName) {
        super(id, name);
        this.email = email;
        this.companyName = companyName;
    }

    //부모 메서드 변경 및 super 확인
    @Override
    public void printUserInfo() {
        super.printUserInfo();
        System.out.println("이메일: " + email);
        System.out.println("회사이름: " + companyName);
    }
}
