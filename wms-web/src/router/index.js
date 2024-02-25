import VueRouter from 'vue-router';
const routes = [
    {
        path: '/login',
        name: 'login',
        component:()=>import('../views/Login')
    },
    {
        path: '/register',
        name: 'register',
        component:()=>import('../views/Register')
    },
    {
        path: '/',
        name: 'index',
        component:()=>import('../views/Index'),
        redirect: "/home",
        children:[
            {
                path: '/home',
                name: 'home',
                meta:{
                    title:'首页'
                },
                component:()=>import('../views/home/Home'),

            },
            {
                path: '/home/article/:id',
                name: 'homeArticle',
                meta:{
                    title:'文化播报'
                },
                component:()=>import('../views/home/comps/ArticleDetail'),

            },
            {
                path: '/heritage',
                name: 'heritage',
                meta:{
                    title:'非物质文化遗产'
                },
                component:()=>import('../views/heritage/heritage'),
            },
            {
                path: '/heritage/article/:id',
                name: 'article',
                meta:{
                    title:'文章页面'
                },
                component:()=>import('../views/heritage/comps/ArticleDetail'),
            },
            // {
            //     path: '/heritage/author/:id',
            //     name: 'author',
            //     meta:{
            //         title:'作者页面'
            //     },
            //     component:()=>import('../views/heritage/TravellerAuthor'),
            // },
            {
                path: '/festivals',
                name: 'festivals',
                meta:{
                    title:'民族节日页面'
                },
                component:()=>import('../views/festivals/festivals'),
            },
            {
                path: '/dress',
                name: 'dress',
                meta:{
                    title:'民族服饰页面'
                },
                component:()=>import('../views/dress/dress'),
            },
            {
                path: '/dress/article/:id',
                name: 'dressArticle',
                meta:{
                    title:'民族服饰详情页面'
                },
                component:()=>import('../views/dress/comps/ArticleDetail'),
            },
            {
                path: '/note/:id',
                name: 'note',
                meta:{
                    title:'小记'
                },
                component:()=>import('../views/note/NoteDetail'),
            },
            {
                path: '/write/note',
                name: 'writeNote',
                meta:{
                    title:'写小记'
                },
                component:()=>import('../views/note/WriteNote'),
            },

        ]
    }
]
const router = new VueRouter({
    mode: 'history',
    routes
})
export function resetRouter() {
    router.matcher = new VueRouter({
        mode: 'history',
        routes:[]
    }).matcher
}
const VueRouterPush = VueRouter.prototype.push
VueRouter.prototype.push = function push(to) {
    return VueRouterPush.call(this,to).catch(err=>err)
}
export default router;