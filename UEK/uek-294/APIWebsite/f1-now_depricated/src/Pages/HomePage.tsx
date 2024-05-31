import { useEffect } from 'react'
import RaceService from '../service/RaceService'

function HomePage() {

  useEffect(() => {
    RaceService()
      .getAllRace()
      .then((response) => {
        console.log(response)
      })
  })
  return (
    <div>HomePage</div>
  )
}

export default HomePage