import Axios from 'axios';
import url from 'postcss-url';
import {get,post} from './http';

// ===========================实时监控模块==========================
// 查询最新风速
export const getWindSpeed = () => get(`manage/windspeed/list`);

// 查询最新水速
export const getWaterSpeed = () => get(`manage/waterspeed/list`);

// 查询最新风向
export const getWindDirect = () => get(`manage/winddirection/list`);

// 查询最新温度
export const getTemperature =() => get(`manage/temperature/list`);

// ===========================码头安全模块==========================
// 查询静力水准数据
export const getStaticLevel =() => get(`manage/staticlevel/list`)