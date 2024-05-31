import { AxiosInstance } from "axios";
import { defaultAxiosInstance } from "./Api";

const StandingsService = (api: AxiosInstance = defaultAxiosInstance) => ({
    getCurrentDriverStanding: async () => {
        const response = await api.get(`/f1/current/driverStandings.json`);
        console.log(response);
        return response.data;
    },
    getCurrentConstructurStandings : async () => {
        const response = await api.get(`/f1/current/constructorStandings.json`);
        console.log(response);
        return response.data;
    }
})

export default StandingsService