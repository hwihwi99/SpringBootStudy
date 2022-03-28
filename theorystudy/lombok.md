## Lombok
반복되는 메소드를 Annotation을 사용하여 자동으로 작성해주는 라이브러리

일반적으로 VO, DTO, Model, Entity등의 데이터 클래스에서 주로 사용됨

대표적으로 많이 사용되는 Annotation
Getter : getter 함수 자동 생성
Setter : setter 함수 자동 생성
NoArgConstructor : 파라미터가 없는 생성자를 생성
AllArgConstructor : 모든 필드값을 파라미터로 갖는 생성자를 생성
RequiredArgsConstructor : 필드값 중 final이나 @NotNull인 값을 갖는 생성자를 생성
Data : 여기 있는 어노테이션 기능을 한번에 추가, 근데 여기 많은 메소드가 추가되어 있어서 필요없는 메소드도 사용 -> 기피하는 경우도 많음
ToString : toString 메소드를 자동으로 생성해주는 기능