const configure = {
    state: {
        HOST: 'http://http://127.0.0.1:8081',
        activeName: ''
    },
    getters: {
        activeName: state => {
            let activeName = state.activeName
            if (!activeName) {
                activeName = JSON.parse(window.sessionStorage.getItem('activeName'))
            }
            return activeName
        }
    },
    mutations: {
        setActiveName: (state, activeName) => {
            state.activeName = activeName
            window.sessionStorage.setItem('activeName', JSON.stringify(activeName))
        }
    }
}

export default configure