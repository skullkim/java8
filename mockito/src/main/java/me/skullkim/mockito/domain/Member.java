package me.skullkim.mockito.domain;

import android.arch.persistence.room.Entity;

@Entity
@Getter @Setter @NoArgsConstructor
public class Member {

	@Id @GeneratedValue
	private Long id;

	private String email;

}
