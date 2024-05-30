import { AxiosInstance } from "axios";
import { defaultAxiosInstance } from "./Api";

const RaceService = (api: AxiosInstance = defaultAxiosInstance) => ({
    getCurrentRace: async () => {
        const response = await api.get(`/f1/current.json`);
        const races = response.data.MRData.RaceTable.Races;

        // Find the most recent race
        const currentRace = races.reduce((mostRecentRace: { date: string | number | Date; }, race: { date: string | number | Date; }) => {
            return new Date(race.date) > new Date(mostRecentRace.date) ? race : mostRecentRace;
        });

        console.log(currentRace);
        return currentRace;
    },
    getAllRace: async () => {
        const response = await api.get(`/f1/current.json`);
        console.log(response)
        return response.data;
    }

})

export default RaceService