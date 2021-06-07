import moment from "moment";

export const formatData = (date:string) =>{
    return moment(date).format('DD/MM/YY HH:mm');
}