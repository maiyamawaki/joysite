package com.joysite.backend.service;

import org.springframework.stereotype.Service;

import com.joysite.backend.repository.UsrRepository;
import com.joysite.backend.entity.Usr;
import com.joysite.backend.dto.UsrDto;

@Service
public class UsrService {
	
	private UsrRepository usrRepo;

	public UsrService(UsrRepository usrRepo) {
		this.usrRepo = usrRepo;
	}

	private UsrDto toDto(Usr user) {
		UsrDto dto = new UsrDto(user.getUserId(),
														user.getFamilyName(),
														user.getFirstName(),
														user.getEmail(),
														user.getPhoneNumber(),
														user.getPostalCode(),
														user.getAddress(),
														user.getInsTime(),
														user.getUpdTime());
		return dto;
	}

	public Usr registerUser(UsrDto usrDto) {
		Usr usr = usrRepo.findbyEmail(usrDto.getEmail());
		if(usr == null) {
			Usr newUser = new Usr(usrDto.getFamilyName(),
												usrDto.getFirstName(),
												usrDto.getEmail(),
												usrDto.getPhoneNumber(),
												usrDto.getPostalCode(),
												usrDto.getAddress());
			usrRepo.save(newUser);
			return newUser;
		}  else {
			return usr;
		}
	}

	public UsrDto getUserByEmail(String email) {
		Usr usr = usrRepo.findbyEmail(email);
		return toDto(usr);
	}

}
