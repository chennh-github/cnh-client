<template>
	<div class="left">
		<div class="logo">
			<a href="javascript: void(0);">
				<img src="../../assets/logo.png">
				<span>后台管理</span>
			</a>
		</div>
		<nav class="nav">
			<ul v-show="list.length > 0">
				<li v-for="m in list" @click="clickMenu(m)" :class="{active: active1 === m.id}">
					<a href="javascript: void(0);">
						<i class="fa" :class="m.icon"></i>
						<span>{{m.title}}</span>
						<i class="fa fa-plus" v-show="m.children.length > 0"></i>
					</a>
					<transition-group tag="ul" v-show="m.children.length > 0" name="slideDown">
						<li v-for="c in m.children"  @click="clickMenu(c)" 
						:class="{active: active1 === c.id}">
							<a href="javascript: void(0);">
								<i class="fa" :class="c.icon"></i>
								<span>{{c.title}}</span>
							</a>
						</li>
					</transition-group>
				</li>
			</ul>
		</nav>
	</div>
</template>
<script type="text/babel">
	export default {
		data () {
			return {
				active1: ''
			};
		},
		props: {
			list: {
				type: Array,
				default () {
					return [];
				}
			}
		},
		methods: {
			clickMenu (menu) {
				this.active1 = menu.id;
			}
		}
	}
</script>
<style lang="scss">
	.left {
		display: flex;
		flex-direction: column;
		.nav {
			flex: 1;
			overflow: auto;
		}
	}
	.logo {
		a {
			display: block;
			padding: 10px 20px;
			height: 60px;
			font: 18px/60px 'microsoft yahei';
			vertical-align: middle;
			color: #fff;
			overflow: hidden;
			text-overflow: ellipsis;
			word-break: break-all;
			word-wrap: break-word;
			img {
				float: left;
				max-width: 100px;
				height: 40px;
				margin: 10px;
			}
			&:hover {
				text-decoration: none;
			}
		}
	}
	.nav {
		ul {
			transition: all .3s linear;
			li {

			}
			a {
				position: relative;
				display: block;
				padding: 12px 20px 12px 25px;
				font-size: 14px;
				color: rgba(255,255,255,0.7);
				user-select: none;
				transition: all.2s linear;
				&:hover {
					text-decoration: none;
				}
			}
		}
		&>ul {
			&>li {
				&>a {
					&>i {
						display: inline-block;
						margin-right: 10px;
						text-align: center;
						font-size: 14px;
						width: 20px;
						transition: all .2s linear;
					}
					.fa-plus {
						position: absolute;
						top: 18px;
						left: 5px;
						font-size: 12px;
					}
				}
				&>ul {
					display: none;
					li {
						&:hover, &.active {
							a {
								color: rgba(255, 255, 255, 1);
								background: #20a0ff;
							}
						}
					}
					a {
						padding: 8px 0 8px 30px;
						i {
							margin-right: 15px;
						}
					}
				}
				&:hover, &.active {
					background: rgb(51, 56, 70);
					&>a {
						color: rgba(255, 255, 255, 1);
						background: rgb(21, 26, 40);
					}
					&>ul {
						display: block;
					}
				}
			}
		}
	}
	.slideDown-enter, .slideDown-leave-active {
		display: none;
	}
	.slideDown-enter-active, .slideDown-leave {

	}
</style>