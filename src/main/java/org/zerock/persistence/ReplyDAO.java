package org.zerock.persistence;

import java.util.List;

import org.zerock.domain.Criteria;
import org.zerock.domain.ReplyVO;

public interface ReplyDAO {

	public List<ReplyVO> list(Integer bno) throws Exception;
	public void create(ReplyVO vo) throws Exception; //댓글 등록
	public void update(ReplyVO vo) throws Exception; //댓글 수정
	public void delete(Integer rno) throws Exception; //댓글 삭제
	public List<ReplyVO> listPage(Integer bno, Criteria cri) throws Exception;
	public int count(Integer bno) throws Exception;
}
