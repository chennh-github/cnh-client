<template>
	<div id="app">
        <div class="app-container">
            <XLeft class="x-left" :list="menuList"></XLeft>
            <div class="x-wrapper">
                <XHeader class="x-header"></XHeader>
                <XMain class="x-main"></XMain>
            </div>
        </div>
	</div>
</template>

<script>
import XHeader from './components/frame/header.vue';
import XLeft from './components/frame/left.vue';
import XMain from './components/frame/main.vue';

export default {
	name: 'app',
    data () {
        return {
            menuList: []
        };
    },
	components: {
		XHeader,
		XLeft,
		XMain
	},
    mounted () {
        let menuList = [];
        for (let i = 0; i < 11; i++) {
            let v = {
                icon: 'fa-dashboard',
                title: 'title-' + i,
                children: []
            };
            menuList.push(v);
            if (i %3 === 0) {
                for (let j = 0; j < 6; j++) {
                    v.children.push({
                        icon: 'fa-angle-right',
                        title: 'child-' + j
                    })
                }
            }
        }
        this.menuList = menuList;
    }
}
</script>

<style lang="scss">
	#app {
		position: fixed;
		top: 0;
		left: 0;
		width: 100%;
		height: 100%;
        overflow: auto;
	}
    .app-container {
        height: 100%;
        min-width: 1000px;
        min-height: 600px;
        display: flex;
    }
    .x-left {
        width: 250px;
        background: rgb(61, 76, 90);
    }
	.x-wrapper {
		flex: 1;
		display: flex;
        flex-direction: column;
	}
    .x-header {
        height: 80px;
        background: rgb(32, 160, 255);
    }
    .x-main {
        flex: 1;
    }
</style>
