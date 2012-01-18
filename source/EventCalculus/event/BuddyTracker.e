option encoding 3
sort boolean
sort integer
reified sort predicate
reified sort function

sort time: integer
sort offset: integer

reified sort fluent
reified sort event
reified sort event1
reified sort event2

predicate Happens(event,time)
predicate HoldsAt(fluent,time)
predicate ReleasedAt(fluent,time)
predicate Initiates(event,fluent,time)
predicate Terminates(event,fluent,time)
predicate Releases(event,fluent,time)
predicate Trajectory(fluent,time,fluent,offset)
; predicate Accessible(position,position,time)

sort log
sort location
sort user
sort device
sort storage
sort knowledgeOfActivity: boolean
sort network
predicate IsPerformedBy(knowledgeOfActivity, user, time) 
predicate IsLoggedIn(location, user, storage, time) 
predicate IsAccurate(device, location) 

device theDevice, faultyDevice

{device} [location, time] HoldsAt(IsAccurate(device, location), time).
; claim A1
; [time] IsPerformedBy(KnowledgeOfActivity, User, time) -> IsLoggedIn(Location, User, Storage, time+4).

range time 0 10
range offset 0 0
