package in.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entities.Counsellor;

public interface CounsellorRepo extends JpaRepository<Counsellor, Integer> {

	// select * from counsellor_tbl where email=? and pwd=?
	public Counsellor findByEmailAndPwd(String email, String pwd);

}
