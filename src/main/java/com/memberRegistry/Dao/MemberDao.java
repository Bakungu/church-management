
            package com.memberRegistry.Dao;

            import java.sql.ResultSet;
            import java.sql.SQLException;
            import java.util.List;

            import javax.sql.DataSource;

            import org.springframework.dao.DataAccessException;
            import org.springframework.jdbc.core.JdbcTemplate;
            import org.springframework.jdbc.core.ResultSetExtractor;
            import org.springframework.jdbc.core.RowMapper;

            import com.memberRegistry.model.Member;

            public class MemberDao implements MemberRepository {

                private JdbcTemplate jdbcTemplate;

                public MemberDao(DataSource dataSource) {
                    this.jdbcTemplate = new JdbcTemplate(dataSource);
                }

                @Override
                public int save(Member member) {
                    String sql = "INSERT INTO member (memberId, firstName, lastName, address, dateOfBirth, contactDetails, gender, maritalStatus, baptismDate, baptismLocation, pastorName) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                    return jdbcTemplate.update(sql, member.getMemberId(), member.getFirstName(), member.getLastName(), member.getAddress(), member.getDateOfBirth(), member.getContactDetails(), member.getGender(), member.getMaritalStatus(), member.getBaptismDate(), member.getBaptismLocation(), member.getPastorName());
                }

                @Override
                public Member get(String memeberId) {
                    String sql = "SELECT * FROM member WHERE memberId = ?";
                    Object[] params = { memeberId };

                    ResultSetExtractor<Member> extractor = rs -> {
                        if (rs.next()) {
                            String memberId = rs.getString("memberId");
                            String firstName = rs.getString("firstName");
                            String lastName = rs.getString("lastName");
                            String address = rs.getString("address");
                            String dateOfBirth = rs.getString("dateOfBirth");
                            String contactDetails = rs.getString("contactDetails");
                            String gender = rs.getString("gender");
                            String maritalStatus = rs.getString("maritalStatus");
                            String baptismDate = rs.getString("baptismDate");
                            String baptismLocation = rs.getString("baptismLocation");
                            String pastorName = rs.getString("pastorName");
                            return new Member(memberId, firstName, lastName, address, dateOfBirth, contactDetails, gender, maritalStatus, baptismDate, baptismLocation, pastorName);
                        }
                        return null;
                    };
                    return jdbcTemplate.query(sql, params, extractor);
                }

                @Override
                public int delete(String id) {
                    String sql = "DELETE FROM member WHERE memberId = ?";
                    Object[] params = { id };
                    return jdbcTemplate.update(sql, params);
                }

                @Override
                public int update(Member member) {
                    String sql = "UPDATE member SET firstName = ?, lastName = ?, address = ?, dateOfBirth = ?, contactDetails = ?, gender = ?, maritalStatus = ?, baptismDate = ?, baptismLocation = ?, pastorName = ? WHERE memberId = ?";
                    Object[] params = { member.getFirstName(), member.getLastName(), member.getAddress(), member.getDateOfBirth(), member.getContactDetails(), member.getGender(), member.getMaritalStatus(), member.getBaptismDate(), member.getBaptismLocation(), member.getPastorName(), member.getMemberId() };
                    return jdbcTemplate.update(sql, params);
                }

                @Override
                public List<Member> list() {
                    String sql = "SELECT * FROM member";
                    RowMapper<Member> rowMapper = (rs, rowNum) -> {
                        String memberId = rs.getString("memberId");
                        String firstName = rs.getString("firstName");
                        String lastName = rs.getString("lastName");
                        String address = rs.getString("address");
                        String dateOfBirth = rs.getString("dateOfBirth");
                        String contactDetails = rs.getString("contactDetails");
                        String gender = rs.getString("gender");
                        String maritalStatus = rs.getString("maritalStatus");
                        String baptismDate = rs.getString("baptismDate");
                        String baptismLocation= rs.getString("baptismLocation");
                        String pastorName = rs.getString("pastorName");
            return new Member(memberId, firstName, lastName, address, dateOfBirth, contactDetails, gender, maritalStatus, baptismDate, baptismLocation, pastorName);
            };
            return jdbcTemplate.query(sql, rowMapper);
            }
            }


