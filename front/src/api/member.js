import { apiInstance } from "@/api/index.js";

const api = apiInstance();
const cURL = "/member";

async function selectMemberList(success, fail) {
  api.get(`${cURL}/list`).then(success).catch(fail);
}

// 회원가입
// async function createMember(member, success, fail) {
//   api.post(`${cURL}/signup`, JSON.stringify(member)).then(success).catch(fail);
// }
// store로 하게 되면 에러 발생시 에러 핸들링을 모르겠어서 회원가입 창에서 직접 axios를 부르는 방법으로 대체.

// 로그인 말고 유저정보 하나만 가져오는게 필요할 때 사용할 메서드
// async function selectMember(articleno, success, fail) {
//   api.get(`${cURL}/view/${articleno}`).then(success).catch(fail);
// }

// 로그인
async function doLogin(member, success, fail) {
  api.post(`${cURL}/login/user`, JSON.stringify(member)).then(success).catch(fail);
}

async function updateMember(member, success, fail) {
  api.put(`${cURL}/update`, JSON.stringify(member)).then(success).catch(fail);
}

async function deleteMember(userId, success, fail) {
  api.delete(`${cURL}/delete/${userId}`).then(success).catch(fail);
}

export { selectMemberList, doLogin, updateMember, deleteMember };