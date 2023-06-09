import request from '@/utils/request'

export function answerSubmit (data) {
    return request({
        url: '/student/exam/paper/answer/answerSubmit',
        method: 'post',
        data
    })
}


export function pageList (data) {
    return request({
        url: '/student/exam/paper/answer/pageList',
        method: 'post',
        data
    })
}

export function read (id) {
    return request({
        url: '/admin/exam/paper/answer/read',
        method: 'post',
        params: {
            id
        }
    })
}