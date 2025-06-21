const base = {
    get() {
        return {
            url : "http://localhost:8080/springboot97g672pu/",
            name: "springboot97g672pu",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboot97g672pu/front/dist/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "基于 web 的病历管理系统的设计与实现"
        } 
    }
}
export default base
