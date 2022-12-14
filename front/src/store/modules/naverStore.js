import { selectNaverNews } from "@/api/naverNews";

const naverStore = {
  namespaced: true,
  state: {
    naverNews: [],
  },
  getters: {
    getNaverNews(state) {
      return state.naverNews;
    },
  },
  actions: {
    setNaverNews({ commit }) {
      selectNaverNews(
        ({ data }) => {
          // console.dir(data.items);
          commit("SET_NAVER_NEWS", data);
        },
        (err) => {
          console.log(err);
        }
      );
    },
  },
  mutations: {
    SET_NAVER_NEWS(state, data) {
      state.naverNews = data.items;
    },
  },
};

export default naverStore;
