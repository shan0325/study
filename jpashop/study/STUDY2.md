## 프록시 객체의 초기화
- 프록시 객체는 처음 사용할 때 한번만 초기화 된다.
프록시 객체를 초기화 할 때, 프록시 객체가 실제 엔티티로 바뀌는 것이 아니다. 초기화를 통해서 실제 엔티티에 접근이 가능해진 것이다.
프록시 객체는 원본 엔티티를 상속 받는다. 따라서 타입 체크시 == 비교가 아닌, instead of 로 타입을 비교해야 한다.
영속성 컨텍스트(1차 캐시)에 이미 찾는 엔티티가 존재하면, em.getReference()를 호출해도 실제 엔티티를 반환한다. (굳이 실객체가 있는제 프록시를 반환할 이유가 없다. 최적화 등의 이유로)
영속성 컨텍스트의 도움을 받을 수 없는 준영속 상태일 때, 프록시를 초기화하면 문제 발생한다.
em.close(), em.detach(entity) 를 하면 더이상 영속성 컨텍스트의 도움을 받을 수 없기 때문에 예외가 발생한다.
하이버네이트는 org.hibernate.LazyInitializationException을 터뜨린다.

## 영속성 전이: CASCADE
- 특정 엔티티를 영속 상태로 만들 때 연관된 엔티티도 함께 영속 상태로 만들고 싶을 때 
- 예: 부모 엔티티를 저장할 때 자식 엔티티도 함께 저장.
#### 영속성 전이: CASCADE - 주의
- 영속성 전이는 연관관계를 매핑하는 것과 아무 관련이 없음
- 엔티티를 영속화할 때 연관된 엔티티도 함께 영속화하는 편리함을 제공할 뿐
#### 언제 쓰느냐?
- 하나의 부모가 자식들을 관리할 때(단일 엔티티에 종속적인 경우)
- 라이프사이클이 같을때, 단일 소유자
#### 쓰면 안되는 케이스?
- 자식의 연관 관계가 2개 이상일때

## 고아 객체
- 고아 객체 제거: 부모 엔티티와 연관관계가 끊어진 자식 엔티티를 자동으로 삭제
- orphanRemoval = true 
- Parent parent1 = em.find(Parent.class, id);<br/>
parent1.getChildren().remove(0);<br/>
//자식 엔티티를 컬렉션에서 제거