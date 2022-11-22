export type Song = {
    id: number;
    title: string;
    artist: string;
    duration: string;
    category: string;
    indicatedBestSong: boolean;
    indicatedBestCategory: boolean;
    url: string;
    img: string;
    average: number;
    countVotes: number;
}

export type SongPage = {
    content: Song[];
    last: boolean;
    totalPages: number;
    totalElements: number;
    size: number;
    number: number;
    first: boolean;
    numberOfElements: number;
    empty: boolean;
}
