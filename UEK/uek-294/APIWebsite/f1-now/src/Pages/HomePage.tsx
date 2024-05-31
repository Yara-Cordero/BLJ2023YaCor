import { useEffect, useState } from 'react'
import RaceService from '../service/RaceService'
import { Grid, Typography } from '@mui/material'
import CurrentRaceInfo from '../Organism/CurrentRaceInfo'

type RaceType = {
  Circuit : {
    Location : {
      country: string
    }
  }
  date: string,
  time: string,
  FirstPractice : {
    date: string,
    time: string
  },
  SecondPractice : {
    date: string,
    time: string
  },
  ThirdPractice : {
    date: string,
    time: string
  },
  Qualifying : {
    date: string, 
    time: string
  }

}

function HomePage() {
const [raceData, setRaceData] = useState<RaceType>();

  useEffect(() => {
    RaceService()
      .getCurrentRace()
      .then((response : RaceType) => {
        console.log(response)
        setRaceData(response);
      })
  }, [])

  return (
    <>
    <div className='spanBox'>
    {raceData && (
      <div>
        <div className='titleBox'>
          <Typography sx={{fontFamily: 'Bebas Neue', fontSize: '150px'}}>
              Current Race
          </Typography>
          <Typography sx={{fontFamily: 'Bebas Neue', fontSize: '50px', margin: '7px'}}>
            {raceData.Circuit.Location.country}
          </Typography>
        </div>
          <div className='currentRaceInfo'>
            <Grid container rowSpacing={1} >
              <CurrentRaceInfo name={"Free Practice 1"} dateAndTime={`${raceData.FirstPractice.date} ${raceData.FirstPractice.time}`} />
              <CurrentRaceInfo name={"Free Practice 2"} dateAndTime={`${raceData.SecondPractice.date} ${raceData.SecondPractice.time}`} />
              <CurrentRaceInfo name={"Free Practice 3"} dateAndTime={`${raceData.ThirdPractice.date} ${raceData.ThirdPractice.time}`} />
              <CurrentRaceInfo name={"Qualifying"} dateAndTime={`${raceData.Qualifying.date} ${raceData.Qualifying.time}`} />
              <CurrentRaceInfo name={"Race"} dateAndTime={`${raceData.date} ${raceData.time}`} />
            </Grid>
          </div>
        </div>
      )}
    </div>
    </>
  
  )
}

export default HomePage