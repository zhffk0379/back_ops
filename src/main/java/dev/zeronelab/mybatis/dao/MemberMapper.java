package dev.zeronelab.mybatis.dao;

import dev.zeronelab.mybatis.vo.MemberEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MemberMapper {

    public List<MemberEntity> idCheck(MemberEntity memberEntity) throws Exception;
    public List<MemberEntity> eamilCheck(MemberEntity memberEntity) throws Exception;
    public void join(MemberEntity memberEntity) throws Exception;
    public MemberEntity selectMemberPW(MemberEntity memberEntity) throws Exception;
    public List<MemberEntity> login(MemberEntity memberEntity) throws Exception;
    public List<MemberEntity> jwtLogin(MemberEntity memberEntity) throws Exception;

    public Long findMno(String bwriter) throws Exception;

    public MemberEntity selectPasswordByMno(Integer mno) throws Exception;

    public void updateMemberInfo(MemberEntity vo) throws Exception;

    List<MemberEntity> infoEmailCheck(MemberEntity vo) throws Exception;

    public int deleteMemberByMno(Integer mno) throws Exception;

    public List<Integer> selectBnos(Integer mno) throws Exception;
    public List<Integer> selectPonos(Integer mno) throws Exception;
    public void deleteAttachs(Integer bno) throws Exception;
    public void deleteAllcomments(Integer bno) throws Exception;
    public void deleteDeliverys(Integer pono) throws Exception;

    public void deleteComments(Integer mno) throws Exception;
    public void deleteReviews(Integer mno) throws Exception;
    public void deleteBuckets(Integer mno) throws Exception;
    public void deleteFboard(Integer mno) throws Exception;
    public void deletePorder(Integer mno) throws Exception;

    public MemberEntity idAndEmailCheck(@Param("mid") String mid, @Param("memail") String memail) throws Exception;


}
